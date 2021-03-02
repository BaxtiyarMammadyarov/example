package az.mycompany.javalessons.swing;



import java.sql.*;



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
            System.out.println("conecting");
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

    public void insertTablePerson(az.mycompany.javalessons.swing.User user) {
        if (conn == null) connectDb();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into person(id,firstname,surname,fathername,age,gender)" +
                    "values (DEFAULT,'" + user.getName() +
                    "','" + user.getSurname() + "','" + user.getFathername() + "','" + user.getAge() +
                    "','" + user.getGender() + "')");
            System.out.println("inset table");
            disConnectDb();
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

    }




    public static void main(String[] args) {
        DbConnect conn = new DbConnect();
        conn.connectDb();
    }


    public void insertUserTable(az.mycompany.javalessons.swing.User user) {

        try {if(conn==null) connectDb();
            int max = 0;
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select max(id)  from person");
            while (rs.next()) {
                max = rs.getInt(1);
            }
            statement.executeUpdate("insert into usertable (person_id,username,password)" +
                    "values(" + max + ",'" + user.getUsername() + "','" + user.getPassword() + "')");
            System.out.println("insert usertable");
            disConnectDb();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
    }

