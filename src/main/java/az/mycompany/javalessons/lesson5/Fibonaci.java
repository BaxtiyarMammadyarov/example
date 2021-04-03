package az.mycompany.javalessons.lesson5;

public class Fibonaci {
    public static void main(String[] args) {
        int s1 = 0;
        int s2 = 1;
        System.out.println(s1);
        System.out.println(s2);
        for (int i = 1; i < 10; i++) {
            int s = s1 + s2;
            s1 = s2;
            s2 = s;
            System.out.println(s);


        }
    }
}
