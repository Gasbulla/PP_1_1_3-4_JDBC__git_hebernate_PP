package jm.task.core.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String host = "jdbc:mysql://localhost:3306/mysqlmrx?serverTimezone=UTC";
    private static final String login = "root";
    private static final String password = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(host, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
