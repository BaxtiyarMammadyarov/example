package az.mycompany.javalessons.lesson12;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicatesInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Baxtiyar", "Umud", "Xaqani", "Nihad");
        List<String> nameWith = names.stream()
                .filter(name -> name.equals("Umud"))
                .collect(Collectors.toList());


    }
}
