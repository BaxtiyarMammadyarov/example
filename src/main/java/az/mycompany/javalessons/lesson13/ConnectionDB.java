package az.mycompany.javalessons.lesson13;

import java.sql.*;
import java.sql.Statement;

public class ConnectionDB {
    public static void main(String[] args) {

        Connection conn=null;
        String url="jdbc:postgresql://localhost:5432/iktlab";
        String dbuesr="postgres";
        String pass="sys";

        try {
             conn= (Connection) DriverManager.getConnection(url,dbuesr,pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            Statement st=conn.createStatement();

            st.executeUpdate("insert into public.users(id,name) values (5,'name5')");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
