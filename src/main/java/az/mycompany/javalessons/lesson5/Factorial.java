package az.mycompany.javalessons.lesson5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int factorial = 1;
        System.out.print("ededi daxil edin : ");
        int num = scn.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial= " + factorial);
    }
}
