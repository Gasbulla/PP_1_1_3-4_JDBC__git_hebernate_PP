package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    public static final UserService us = new UserServiceImpl();
    public static final User user1 = new User("Maga","Idrisov",(byte)23);
    public static final User user2 = new User("Sakinat","Magoeva",(byte)24);
    public static final User user3 = new User("ligmat","Ligmatov",(byte)21);
    public static final User user4 = new User("Hapiz","Ibrashov",(byte)20);
    public static final User user5 = new User("Taibat","Ligmatova",(byte)25);

    public static void main(String[] args) {

        us.createUsersTable();
        us.saveUser(user1.getName(),user1.getLastName(),user1.getAge());
        us.saveUser(user2.getName(),user2.getLastName(),user2.getAge());
        us.saveUser(user3.getName(),user3.getLastName(),user3.getAge());
        us.saveUser(user4.getName(),user4.getLastName(),user4.getAge());
        us.saveUser(user5.getName(),user5.getLastName(),user5.getAge());
//        us.removeUserById(1);

        us.getAllUsers().forEach(System.out::println);
//
        us.cleanUsersTable();
        us.dropUsersTable();
//
        Util.closeConnection();
    }
}
