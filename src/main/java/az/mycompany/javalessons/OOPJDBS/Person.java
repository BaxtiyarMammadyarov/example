package az.mycompany.javalessons.OOPJDBS;

public class Person extends Human {
    private boolean gender;
    private String workname;


    public Person(String name, String surname, String gender, String workname) {
        super(name, surname);
        if (gender.equals("qadin")) this.gender = true;
        else if (gender.equals("kisi")) this.gender = false;
    }

    public Person(String name, String surname, int age, Human father, Human mather, String gender, String workname) {
        super(name, surname, age, father, mather);
        if (gender.equals("qadin")) this.gender = true;
        else if (gender.equals("kisi")) this.gender = false;
        this.workname = workname;
    }

    public String isGender() {
        if (gender = true) return "qadin";
        else return "kisi";
    }

    public void setGender(String str) {
        if (str.equals("qadin")) this.gender = true;
        else if (str.equals("kisi")) this.gender = false;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }
}
