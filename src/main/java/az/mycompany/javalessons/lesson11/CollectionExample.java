package az.mycompany.javalessons.lesson11;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List list=new ArrayList();
        for(int i=0;i<5;i++)
            list.add((int)(Math.random()*100));

        list.remove(2);

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
