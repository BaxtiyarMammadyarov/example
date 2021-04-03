package az.mycompany.javalessons.OOPJDBS;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        DbConnect con = new DbConnect();
        con.connectDb();
        Statement stmt = con.creatStm();
        ResultSet set = null;
        try {
            set = stmt.executeQuery("select human.name,human.surname from public.human");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        while (set.next()) {
            System.out.println(set.getString(1) + " " + set.getString(2));
        }

    }
}
