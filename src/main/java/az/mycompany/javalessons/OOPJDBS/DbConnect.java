package az.mycompany.javalessons.OOPJDBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

    private String url;
    private String dbuser;
    private String dbpassword;
    private Connection conn=null;

    public DbConnect(String url, String dbuser, String dbpassword) {
        this.url = url;
        this.dbuser = dbuser;
        this.dbpassword = dbpassword;
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
