package az.mycompany.javalessons.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectSqlite {
    Connection connection = null;
    String url = "jdbc:sqlite:\\D:\\project\\example\\src\\main\\java\\az\\mycompany\\javalessons\\sqlite\\users.db";

    public Connection conectDb() {
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("conection sucsesful");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

        return connection;
    }

    public void disConnectDb() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertUser(User user) {
        if (connection == null) conectDb();
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("insert into main.usertable (id,username,password) " +
                    "values (" + user.getId() + ",'" + user.getUsername() + "','" + user.getPassword() + "')");

            System.out.println("insert table 1 row");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        disConnectDb();
    }

    public static void main(String[] args) {
        ConectSqlite conn = new ConectSqlite();
        conn.conectDb();
        User user = new User(5, "Murad5", "murad1235");
        conn.insertUser(user);

    }


}
