package az.mycompany.javalessons.OOPJDBS;

public class Human {
    private String name;
    private String surname;
    private int age;
    private Human father;
    private Human mather;

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int age, Human father, Human mather) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.father = father;
        this.mather = mather;
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

    public void setAge(int age) {
        if (age < 200 && age > 1) this.age = age;
        else System.out.println("yas duzgun daxil edilmeyib");
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMather() {
        return mather;
    }

    public void setMather(Human mather) {
        this.mather = mather;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", father=" + father.name +
                ", mather=" + mather.name +
                '}';
    }
}
