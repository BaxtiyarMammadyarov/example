package az.mycompany.javalessons.registrationapp;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private String fathername;
    private byte age;
    private Gender gender;

    public Person() {
    }

    public Person(Integer id, String name, String surname, String fathername, int age, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = (byte) age;
        if (gender.equals("k"))
            this.gender = Gender.kisi;
        else if (gender.equals("q"))
            this.gender = Gender.qadin;
    }

    public Person(String name, String surname, String fathername, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = (byte) age;
        if (gender.equals("k"))
            this.gender = Gender.kisi;
        else if (gender.equals("q"))
            this.gender = Gender.qadin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (byte) age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("k"))
            this.gender = Gender.kisi;
        else if (gender.equals("q"))
            this.gender = Gender.qadin;
        else System.out.println("Secim duzgun deyil");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathername='" + fathername + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
