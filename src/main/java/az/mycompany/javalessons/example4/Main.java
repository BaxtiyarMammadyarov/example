package az.mycompany.javalessons.example4;



public class Main  {
    public static void main(String[] args) {
        Person man=new Person();
        man.setName("Michael");
        man.setSurname("Karleone");
        man.setDateofbirthyear(1997);
        man.setIqlevel(90);
        man.setFather(new Human("Vito","Karleone"));
        man.setMother(new Human("Jane","Karleone"));
       man.setSchedule(NonWorkingday.Sunday.toString(),NonWorkingActivities.go_for_a_walkı.toString());
        String[] habits= {"eat", "drink", "sleep"};
        man.setPet(new Pet("dog","Rock", 5, 75,habits));


        man.showHuman();
        System.out.println(man.getPet().habitsPet(1));
        man.nonWorkingActiviti();

}
}
