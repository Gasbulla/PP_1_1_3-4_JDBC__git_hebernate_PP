//package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
//    private final SessionFactory connection = Util.getConnection();
//
//    public UserDaoJDBCImpl() {
//
//    }

//    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS mysqlmrx.peoples" +
//                    "(id int not null auto_increment," +
//                    " name VARCHAR(50), " +
//                    "lastname VARCHAR(50), " +
//                    "age tinyint, " +
//                    "PRIMARY KEY (id))");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("Drop table if exists mysqlmrx.peoples");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO mysqlmrx.peoples(name, lastname, age) VALUES(?,?,?)";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void removeUserById(long id) {
//        try (Statement statement = connection.createStatement()) {
//            String sql = "DELETE FROM mysqlmrx.peoples where id = " + id;
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public List<User> getAllUsers() {
//        List<User> allUser = new ArrayList<>();
//        String sql = "SELECT id, name, lastName, age from mysqlmrx.peoples";
//
//        try (Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                allUser.add(user);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return allUser;
//        return null;
//    }
//
//    public void cleanUsersTable() {
//        String sql = "DELETE FROM mysqlmrx.peoples";
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}