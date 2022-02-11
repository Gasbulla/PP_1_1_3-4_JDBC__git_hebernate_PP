package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Util {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String host = "jdbc:mysql://localhost:3306/mysqlmrx?serverTimezone=UTC";
    private static final String login = "root";
    private static final String password = "root";
    private static org.hibernate.SessionFactory sessionFactory = null;

    public static SessionFactory getConnection() {
        try {
                Configuration configuration = new Configuration()
                        .setProperty("hibernate.connection.driver_class", driver)
                        .setProperty("hibernate.connection.url", host)
                        .setProperty("hibernate.connection.username", login)
                        .setProperty("hibernate.connection.password", password)
                        .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                        .addAnnotatedClass(User.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return sessionFactory;
        }
    public static void closeConnection() {
        if (sessionFactory != null)
            sessionFactory.close();
    }
//    public static Connection getConnection() {
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(host, login, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }
}
