package az.mycompany.javalessons.OOPJDBS;

import java.sql.*;

public class DbConnect {

    private String url="jdbc:postgresql://localhost:5432/iktlab";
    private String dbuser="postgres";
    private String dbpassword="sys";
    private Connection conn=null;

    public DbConnect() {

    }

    public Connection connectDb(){

        try {
            conn= DriverManager.getConnection(url,dbuser,dbpassword);

            System.out.println("Ugurlu connection");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("ugursuz connection");
        }
        return conn;
    }

    public Statement creatStm(){
        Statement stmt = null;
        try {
           stmt= conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    return stmt;}



}
