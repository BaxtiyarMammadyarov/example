package az.mycompany.javalessons.OOPJDBS;

import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        DbConnect con=new DbConnect("jdbc:postgresql://localhost:5432/iktlab","postgres","sys");
        con.connectDb();



    }
}
