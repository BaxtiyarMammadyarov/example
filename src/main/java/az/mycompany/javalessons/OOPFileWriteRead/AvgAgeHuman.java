package az.mycompany.javalessons.OOPFileWriteRead;

import java.util.*;
import java.util.stream.Collectors;

public class AvgAgeHuman {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Steven", "King", 45, "Kochhar", "Neena"));
        humanList.add(new Human("Alexande", "Hunold", 40, "Ernst", "Diana"));
        humanList.add(new Human("Nancy", "Greenberg", 55, "John", "Julia"));
        humanList.add(new Human("Payam", "Fripp", 35, "Vollman", "Julia"));
        humanList.add(new Human("Steven", "Hunold", 30, "John", "Neena"));
        humanList.add(new Human("Irene", "Landry", 25, "James", "Laura"));
        humanList.add(new Human("Ernst", "Fripp", 50, "Michael", "Trenna"));
        humanList.add(new Human("John", "Patel", 28, "Stephen", "Janette"));
        humanList.add(new Human("McEwen", "Doran", 60, "Allan", "Clara"));
        humanList.add(new Human("William", "Smith", 38, "Harrison", "Lisa"));
        humanList.add(new Human("Ellen", "Abel", 23, "Jack", "Julia"));
        humanList.add(new Human("Smith", "James", 23, "Michael", "Diana"));
        humanList.add(new Human("Samuel", "McCain", 43, "Pat", "Jennifer"));
        humanList.add(new Human("Hermann", "Baer", 37, "William", "Shelley"));
        humanList.add(new Human("Douglas", "Grant", 53, "Kevin", "Susan"));
        System.out.println("----------------Age AVG-------------------");
        System.out.println("avg= " + humanList
                .stream()
                .collect(Collectors.averagingInt(Human::getAge)).intValue());

        System.out.println("----------------Age Min-------------------");
        System.out.println("min= " + humanList
                .stream()
                .min(Comparator
                        .comparingInt(Human::getAge))
                .get()
                .getAge());

        humanList
                .stream()
                .filter(human -> human.getAge() == humanList
                        .stream()
                        .min(Comparator.comparingInt(Human::getAge))
                        .get()
                        .getAge())
                .forEach(human -> System.out.println(human.toString()));


        System.out.println("----------------Age Max-------------------");
        System.out.println("max= " + humanList
                .stream()
                .max(Comparator.comparingInt(Human::getAge))
                .get()
                .getAge());

        humanList
                .stream()
                .filter(human -> human.getAge() == humanList
                        .stream()
                        .max(Comparator.comparingInt(Human::getAge))
                        .get()
                        .getAge())
                .forEach(human -> System.out.println(human.toString()));

        System.out.println("----------------Age Sum-------------------");

        System.out.println("sum= " + (Integer) humanList
                .stream()
                .mapToInt(Human::getAge)
                .sum());


    }
}
