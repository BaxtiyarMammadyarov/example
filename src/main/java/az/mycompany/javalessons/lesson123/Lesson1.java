package az.mycompany.javalessons.lesson123;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        boolean bool;
        System.out.print("Ededi daxil et: ");
        a = scn.nextInt();
        b = (int) (Math.random() * 101);
        bool = (a == b);
        System.out.println(bool);
        System.out.println(b);
    }

}
