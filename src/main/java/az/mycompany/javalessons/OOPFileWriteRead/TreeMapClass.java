package az.mycompany.javalessons.OOPFileWriteRead;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

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
        humanList.add(new Human("Smith", "James", 33, "Michael", "Diana"));
        humanList.add(new Human("Samuel", "McCain", 43, "Pat", "Jennifer"));
        humanList.add(new Human("Hermann", "Baer", 37, "William", "Shelley"));
        humanList.add(new Human("Douglas", "Grant", 53, "Kevin", "Susan"));

        Map<Integer, Human> sortAge = new TreeMap<>();
        humanList.forEach(human -> sortAge.put(human.getAge(), human));
        sortAge.forEach((integer, human) -> System.out.println(sortAge.get(integer).toString()));
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        Map<String, Human> sortName = new TreeMap<>();
        humanList.forEach(human -> sortName.put(human.getName(), human));
        sortName.forEach((s, human) -> System.out.println(sortName.get(s).toString()));


    }
}
