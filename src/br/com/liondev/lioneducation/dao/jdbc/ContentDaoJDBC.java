package br.com.liondev.lioneducation.dao.jdbc;

import java.sql.Connection;
import java.util.List;
import br.com.liondev.lioneducation.dao.ContentDao;
import br.com.liondev.lioneducation.database.ConnectionFactory;
import br.com.liondev.lioneducation.database.DbException;
import br.com.liondev.lioneducation.entities.Content;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ContentDaoJDBC implements ContentDao {

    private final Connection connection;

    public ContentDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Content obj) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO `content` (subject_id, content_date, content_status, content_importance, content_value) "
                    + "VALUES (?,?,?,?,?)");

            preparedStatement.setInt(1, obj.getSubjectId());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            Date date = new Date();

            String dataformatada = sdf.format(date);
            preparedStatement.setString(2, dataformatada);
            preparedStatement.setInt(3, obj.getStatus());
            preparedStatement.setInt(4, obj.getImportance());
            preparedStatement.setString(5, obj.getContent());

            preparedStatement.execute();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
        }
    }

    @Override
    public void update(Integer id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("UPDATE content SET content_status = ? "
                    + " WHERE content_id = ?");

            preparedStatement.setInt(1, 2);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "DELETE FROM `content` WHERE content_id = ?");

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
        }
    }

    @Override
    public List<Content> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM content ORDER BY `content_status` ASC;");

            resultSet = preparedStatement.executeQuery();

            List<Content> list = new ArrayList<>();

            while (resultSet.next()) {
                Content obj = new Content();
                obj.setId(resultSet.getInt("content_id"));
                obj.setSubjectId(resultSet.getInt("subject_id"));
                obj.setDate(resultSet.getString("content_date"));
                obj.setStatus(resultSet.getInt("content_status"));
                obj.setImportance(resultSet.getInt("content_importance"));
                obj.setContent(resultSet.getString("content_value"));
                
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
            ConnectionFactory.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Content> findAllByStatus(Integer status) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM content WHERE content_status = "+status+";");

            resultSet = preparedStatement.executeQuery();

            List<Content> list = new ArrayList<>();

            while (resultSet.next()) {
                Content obj = new Content();
                obj.setId(resultSet.getInt("content_id"));
                obj.setSubjectId(resultSet.getInt("subject_id"));
                obj.setDate(resultSet.getString("content_date"));
                obj.setStatus(resultSet.getInt("content_status"));
                obj.setImportance(resultSet.getInt("content_importance"));
                obj.setContent(resultSet.getString("content_value"));
                
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
            ConnectionFactory.closeResultSet(resultSet);
        }
    }

    @Override
    public String findSubjectById(Integer id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String name = "";
        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT subject_name FROM subject WHERE subject_id = "+id+";");

            resultSet = preparedStatement.executeQuery();

           while (resultSet.next()) {
               name = resultSet.getString(1);
           }
           
           return name;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
            ConnectionFactory.closeResultSet(resultSet);
        }
    }

    @Override
    public boolean existsContent(String content) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM content WHERE content_value = '" + content + "'");

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
            ConnectionFactory.closeResultSet(resultSet);
        }
        return false;
    }
}
