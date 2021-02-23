package az.mycompany.javalessons.registrationapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;
        while (loop){
            System.out.print("input comand: ");
            String comand=scanner.next();
          loop=  registrationApp(comand);
        }
    }


   static void savePerson(){
      DbConnect conn=new DbConnect();
      Person person=new Person();
      Scanner scn=new Scanner(System.in);
      System.out.print("Input name ");
      person.setName(scn.next());
      System.out.print("Input surname ");
      person.setSurname(scn.next());
      System.out.print("Input father name ");
      person.setFathername(scn.next());
      System.out.print("Input age ");
      person.setAge(scn.nextInt());
      System.out.println("Input gender k/q");
       person.setGender(scn.next());

      conn.insertTablePerson(person);
      System.out.println("Person save ");
      conn.disConnectDb();
  }
   static void registerUser(){
      DbConnect conn=new DbConnect();
      User user=new User();
      Scanner scn=new Scanner(System.in);
      Boolean loop=true;
      while (loop){
          System.out.print("Input user name ");
          String username=scn.next();
          if(conn.userNameCheck(username)){
              user.setUsername(username);
              loop=false;
          }else System.out.println("user name is available. Write a new user name");
      }
      loop=true;
      while (loop){
          System.out.print("Input password ");
          String password=scn.next();
          if(user.passwordCheck(password)){
              user.setPassword(password);
              loop=false;
          }else System.out.println("password does not meet the requirements");

      }
      conn.insertUserTable(user);
      conn.disConnectDb();

  }
     static List showPerson(){
      DbConnect conn=new DbConnect();
        List<List<String>> lists=new ArrayList<>();
        try {
            Statement statement = conn.connectDb().createStatement();
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
        conn.disConnectDb();
        return lists; }
    static boolean registrationApp(String comand){
      boolean bool=true;
      switch (comand){
          case "sp":
              savePerson();
              break;
          case "ru":
              registerUser();
              break;
          case "shp":
              System.out.println(showPerson());
              break;
          case "exit":
              bool=false;
              System.out.println("close App");
              break;
      }
      return bool;
  }


}
