package az.mycompany.javalessons.registrationapp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DbConnect conn=new DbConnect();
        conn.getConn();
        Person person= new Person();

        person.setName("Faiq");
        person.setSurname("Əliyev");
        person.setFathername("Tural");
        person.setAge(40);
        person.setGender(Gender.kisi);

        conn.insertTablePerson(person);



        System.out.println(conn.showUser());

        }


    }

