package az.mycompany.javalessons.example4;



public class Main  {
    public static void main(String[] args) {
        Man man=new Man();
        man.setName("Michael");
        man.setSurname("Karleone");
        man.setDateofbirthyear(1997);
        man.setIqlevel(90);
        man.setFather(new Human("Vito","Karleone"));
        man.setMother(new Human("Jane","Karleone"));
        String[] habits= {"eat", "drink", "sleep"};
        man.setPet(new Pet("dog","Rock", 5, 75,habits));

        man.showHuman();
        System.out.println(man.habitsPet(2));

}
}
