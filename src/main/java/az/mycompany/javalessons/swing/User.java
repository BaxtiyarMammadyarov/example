package az.mycompany.javalessons.swing;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User extends Person {

    private String username;
    private String password;

    public User() {
        super();
    }

    public User(String name, String surname, String fathername, Integer age, String gender, String username, String password) {
        super(name, surname, fathername, age, gender);
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    boolean passwordCheck(String str) {
        boolean answer = false;
        int count = 0;
        if (str.length() >= 8) {
            for (char i : str.toCharArray()) {
                if (Character.isDigit(i)) {
                    count++;
                    if (count > 1 && count < str.length())
                        answer = true;
                } else if (!Character.isAlphabetic(i)) {
                    answer = false;
                    break;
                }

            }
        }
        return answer;
    }

    public boolean userNameCheck(String username) {
        boolean ans = true;
        DbConnect conn = new DbConnect();
        List<String> userlist = new ArrayList<>();
        if (conn == null) conn.connectDb();
        try {
            Statement statement = conn.connectDb().createStatement();
            ResultSet rs = statement.executeQuery("select username from usertable");

            while (rs.next()) {
                userlist.add(rs.getString(1));
            }
            if (userlist.contains(username)) ans = false;

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
        conn.disConnectDb();
        return ans;
    }
}
