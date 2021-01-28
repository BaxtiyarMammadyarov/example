package az.mycompany.javalessons.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list=new Vector<>();
        for(int i=0;i<5;i++)
            list.add((int)(Math.random()*100));



    }
}
