package az.mycompany.javalessons.registrationapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DbConnect {
    final private String dburl = "jdbc:postgresql://localhost:5432/iktlab";
    final private String dbuser = "postgres";
    final private String dbpassword = "sys";
    private Connection conn = null;

    public DbConnect() {
    }

    public Connection connectDb() {
        try {
            conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void disConnectDb() {
        try {
            if (conn != null) conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertTablePerson(User user) {
        if (conn == null) connectDb();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into person(id,firstname,surname,fathername,age,gender)" +
                    "values (DEFAULT,'" + user.getName() +
                    "','" + user.getSurname() + "','" + user.getFathername() + "','" + user.getAge() +
                    "','" + user.getGender() + "')");
            System.out.println("inset table");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

    }

    public void insertUserTable(User user) {

        try {
            int max = 0;
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select max(id)  from person");
            while (rs.next()) {
                max = rs.getInt(1);
            }
            statement.executeUpdate("insert into usertable (person_id,username,password)" +
                    "values(" + max + ",'" + user.getUsername() + "','" + user.getPassword() + "')");
            System.out.println("insert usertable");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    public boolean userNameCheck(String username) {
        boolean ans = true;
        List<String> userlist = new ArrayList<>();
        if (conn == null) connectDb();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select username from usertable");

            while (rs.next()) {
                userlist.add(rs.getString(1));
            }
            if (userlist.contains(username)) ans = false;

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

        return ans;
    }


}
