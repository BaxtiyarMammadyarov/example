package az.mycompany.javalessons.lesson123;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input oreration : +,-,*,/  ");
        String operation = scn.next();
        System.out.print("input number1 : ");
        double number1 = scn.nextDouble();
        System.out.print("input number2 : ");
        double number2 = scn.nextDouble();

        switch (operation.charAt(0)) {

            case '+':
                System.out.println("cem = " + (number1 + number2));
                break;
            case '-':
                System.out.println("ferq = " + (number1 + number2));
                break;
            case '*':
                System.out.println("hasil=" + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println("Qismet = " + (number1 / number2));
                } else System.out.println("Sifira bolme yoxdu : sifirdan ferqli eded secin");
                break;
            default:
                System.out.println("Duzgun operator secin");
        }

    }
}
