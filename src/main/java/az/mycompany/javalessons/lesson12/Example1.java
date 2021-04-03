package az.mycompany.javalessons.lesson12;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import java.util.function.Function;


public class Example1 {


    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Red", "Green", "Black", "White", "Pink");
        List<String> list2 = Arrays.asList("Red", "Green", "Black", "Pink");
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();

        list4.addAll(list1);
        list5.addAll(list2);

        list5.forEach(String -> list4.add(String));

        System.out.println(list4);

    }


}




