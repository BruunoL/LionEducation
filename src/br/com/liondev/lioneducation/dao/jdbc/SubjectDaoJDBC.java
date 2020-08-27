package br.com.liondev.lioneducation.dao.jdbc;

import br.com.liondev.lioneducation.dao.SubjectDao;
import br.com.liondev.lioneducation.database.ConnectionFactory;
import br.com.liondev.lioneducation.database.DbException;
import br.com.liondev.lioneducation.entities.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoJDBC implements SubjectDao {

    private final Connection connection;

    public SubjectDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Subject obj) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO `subject` (subject_name, teacher_name, subject_difficulty) "
                    + "VALUES (?,?,?)");

            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getTeacherName());
            preparedStatement.setDouble(3, obj.getDifficulty());

            preparedStatement.execute();

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
                    "DELETE FROM `subject` WHERE subject_id = ?");

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            ConnectionFactory.closeStatement(preparedStatement);
        }
    }

    @Override
    public List<Subject> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM subject");

            resultSet = preparedStatement.executeQuery();

            List<Subject> list = new ArrayList<>();

            while (resultSet.next()) {
                Subject obj = new Subject();
                obj.setId(resultSet.getInt("subject_id"));
                obj.setName(resultSet.getString("subject_name"));
                obj.setTeacherName(resultSet.getString("teacher_name"));
                obj.setDifficulty(resultSet.getDouble("subject_difficulty"));
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
    public boolean existsSubject(String subject, String teacherName) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM subject WHERE subject_name = '" + subject + "' AND "
                    + "teacher_name = '" + teacherName + "'");

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
