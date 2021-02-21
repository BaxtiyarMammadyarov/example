package az.mycompany.javalessons.registrationapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DbConnect {
  final   private String dburl="jdbc:postgresql://localhost:5432/iktlab";
  final   private String dbuser="postgres";
  final private String dbpassword="sys";
  private Connection conn=null;

    public DbConnect()  {
    }

    public Connection getConn() {
        try {
             conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void insertTablePerson(Person person){
        if(conn==null) getConn();
      try{
          Statement stmt=conn.createStatement();
          stmt.executeUpdate("insert into person(id,firstname,surname,fathername,age,gender)" +
                  "values (DEFAULT,'"+person.getName()+
                  "','"+person.getSurname()+"','"+person.getFathername()+"','"+person.getAge()+
                  "','"+person.getGender()+"')");
          System.out.println("inset table");
      }catch (SQLException se){
          System.out.println(se.getMessage());
      }
    }
    public void insertUserTable(User user){

       try {
           int max = 0;
           Statement statement = conn.createStatement();
           ResultSet rs=statement.executeQuery("select max(id) into "+max+" from person");
           PreparedStatement stmt=conn.prepareStatement("insert into usertable values(?,?,?)");
           stmt.setInt(1,max);
           stmt.setString(2,user.getUsername());
           stmt.setString(3,user.getPassword());
       }catch (Exception e){

       }
    }
    public boolean userNameCheck(String username){
         boolean ans=true;
        List<String> userlist=new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs=statement.executeQuery("select username from usertable");

            while (rs.next()){
                userlist.add(rs.getString(1));
            }
            if(userlist.contains(username)) ans=false;
        }catch (SQLException se){
            System.out.println(se.getMessage());
        }
    return ans;}
    public boolean userPasswordCheck(String password){
        boolean answer=false;
        int count=0;
        if(password.length()>=8){
            for(char i:password.toCharArray()){
                if (Character.isDigit(i)){
                    count++;
                    if (count>1 && count<password.length())
                        answer=true;
                }
                else if(!Character.isAlphabetic(i)) {
                    answer=false;
                    break;
                }

            }
        }
        return answer;
    }

    public List showUser(){
        List<List<String>> lists=new ArrayList<>();
        try {


            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from person");
            while (rs.next()){
                List<String>list=new ArrayList<>();
                list.add(rs.getString(1));
                list.add(rs.getString(2));
                list.add(rs.getString(3));
                list.add(rs.getString(4));
                list.add(rs.getString(5));
                list.add(rs.getString(6));
                lists.add(list);


            }
        }catch (SQLException se){
            System.out.println(se.getMessage());
        }
   return lists; }

}
