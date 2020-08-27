package br.com.liondev.lioneducation.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {

    private static Connection connection = null;
    
    protected static final String TABLE_SUBJECT = "CREATE TABLE IF NOT EXISTS `subject` "
            + "(subject_id TINYINT auto_increment, subject_name VARCHAR(30) not null, teacher_name VARCHAR(30) not null, "
            + "subject_difficulty DOUBLE not null, "
            + "PRIMARY KEY (subject_id));";
   
    protected static final String TABLE_CONTENT = "CREATE TABLE IF NOT EXISTS `content` "
            + "(content_id INT auto_increment, subject_id TINYINT, content_date VARCHAR(20) not null, content_status TINYINT not null, "
            + "content_importance TINYINT not null, content_value VARCHAR(1000) not null, "
            + "PRIMARY KEY (content_id), "
            + "FOREIGN KEY (`subject_id`) REFERENCES `subject` (`subject_id`) ON DELETE SET NULL) ";
    
     public static boolean initialize() {
        Statement createTableStatement = null;
        
        try {
            connection = getConnection();
            System.out.println("Conexao estabelecida com sucesso!");
            
            createTableStatement = connection.createStatement();
            System.out.println("Criando tabela `subject`");
            createTableStatement.executeUpdate(TABLE_SUBJECT);

            System.out.println("Criando tabela `content`");
            createTableStatement.executeUpdate(TABLE_CONTENT);
            
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeStatement(createTableStatement);
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                connection = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                
                connection = null;
                System.err.println("CONEXAO FEHCADA");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
