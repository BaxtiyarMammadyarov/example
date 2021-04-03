package az.mycompany.javalessons.lesson12;

import java.util.Arrays;
import java.util.List;

import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Black", "White", "Pink");

        BiPredicate<String, List<String>> searchList = (String, List) -> (List.contains(String));
        System.out.println(searchList.test("Green", list));


    }
}
