package az.mycompany.javalessons.lesson123;


public class StringExp {
    static void myMetod() {
        System.out.println("salam dunya");

    }

    public static void main(String[] args) {
        String s = "Hello world";

        int a = 5;
        int b = 3;

        s = s.substring(1, 5);

        String s1 = "java string split method by javatpoint";
        String[] words = s1.split("\\s");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        for (String w : words) {
            System.out.println(w);
        }

        b = s1.codePointAt(0);
        //System.out.println(b);
        //System.out.println(s1.replaceFirst("he","s"));

    }
}