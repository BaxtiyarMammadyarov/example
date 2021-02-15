package az.mycompany.javalessons.OOPproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedList {

    public static void main(String[] args) {
        List<Human> humanList=new ArrayList<>();
        humanList.add(new Human("Steven","King",45,"Kochhar","Neena"));
        humanList.add(new Human("Alexande","Hunold",40,"Ernst","Diana"));
        humanList.add(new Human("Nancy","Greenberg",55,"John","Julia"));
        humanList.add(new Human("Payam","Fripp",35,"Vollman","Julia"));
        humanList.add(new Human("Steven","Hunold",30,"John","Neena"));
        humanList.add(new Human("Irene","Landry",25,"James","Laura"));
        humanList.add(new Human("Ernst","Fripp",50,"Michael","Trenna"));
        humanList.add(new Human("John","Patel",28,"Stephen","Janette"));
        humanList.add(new Human("McEwen","Doran",60,"Allan","Clara"));
        humanList.add(new Human("William","Smith",38,"Harrison","Lisa"));
        humanList.add(new Human("Ellen","Abel",23,"Jack","Julia"));
        humanList.add(new Human("Smith","James",33,"Michael","Diana"));
        humanList.add(new Human("Samuel","McCain",43,"Pat","Jennifer"));
        humanList.add(new Human("Hermann","Baer",37,"William","Shelley"));
        humanList.add(new Human("Douglas","Grant",53,"Kevin","Susan"));

        humanList
                 .stream()
                 .sorted(Comparator.comparingInt(Human::getAge).reversed())
                .forEach(human -> System.out.println(human.toString()));
        System.out.println("-----------------------------------------------");

        humanList.forEach(System.out::println);






    }
}
