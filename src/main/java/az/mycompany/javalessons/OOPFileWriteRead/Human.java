package az.mycompany.javalessons.OOPFileWriteRead;

import java.io.Serializable;

public class Human implements Serializable {
    private String name;
    private String surname;
    private int age;
    private String fathername;
    private String mothername;

    public Human() {

    }

    public Human(String name, String surname, int age, String fathername, String mothername) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.fathername = fathername;
        this.mothername = mothername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    @Override
    public String toString() {
        return
                "name= " + name + "\n" +
                        "surname= " + surname + "\n" +
                        "age= " + age + "\n" +
                        "fathername= " + fathername + "\n" +
                        "mothername= " + mothername + "\n";
    }
}
