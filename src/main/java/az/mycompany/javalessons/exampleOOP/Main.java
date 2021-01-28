package az.mycompany.javalessons.exampleOOP;


import java.util.HashSet;
import java.util.Set;

public class Main  {
    public static void main(String[] args) {
        Person man=new Person();
        man.setName("Michael");
        man.setSurname("Karleone");
        man.setDateofbirthyear(1997);
        man.setIqlevel(90);
        man.setFather(new Human("Vito","Karleone"));
        man.setMother(new Human("Jane","Karleone"));
       man.setSchedule("Sanday","go for a walk");
        Set<String> habits=new HashSet<>();
        habits.add("eat");
        habits.add("drink");
        habits.add("sleep");
        man.setPet(new Pet("dog","Rock", 5, 75,habits));



        man.showHuman();
        System.out.println(man.getPet().habitsPet(1));
        man.nonWorkingActiviti("Sanday");

}
}
