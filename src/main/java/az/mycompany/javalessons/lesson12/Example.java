package az.mycompany.javalessons.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example {
    static Function<List<String>[], List<String>> joinArrays = (lists -> {
        List<String> list = new ArrayList<>();
        for (List<String> i : lists)
            list.addAll(i);

        return list;
    });

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Red", "Green", "Black", "White", "Pink");
        List<String> list2 = Arrays.asList("Red", "Green", "Black", "Pink");
        List<String> list3 = Arrays.asList("Yellow", "Green", "Black", "Pink");
        System.out.println(joinArrays.apply(new List[]{list1, list2, list3}));

    }
}
