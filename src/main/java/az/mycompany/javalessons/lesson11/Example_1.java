package az.mycompany.javalessons.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example_1 {
    public static void main(String[] args) {
        String str="Hello World";
        String result="";
       // List<Character> arr=new ArrayList<>();
      List<String>list=new ArrayList<>();
        for (String i:str.split(" "))
               list.add(i);

        list.forEach(System.out::println);

        for (String j:list) {
            int oldindex=j.charAt(0);
            int index=j.toLowerCase().charAt(0);
            char[] arr=new char[j.length()];
            for(int k=0;k<j.length();k++){
                arr[k]=j.toLowerCase().charAt(k);
            }
            Arrays.sort(arr);
            for (char ch:arr) {
                if((int)ch!=index) result+=ch;
                else result+=(char)oldindex;
            }

            result+=" ";
        }

        System.out.println(result);



    }
}
