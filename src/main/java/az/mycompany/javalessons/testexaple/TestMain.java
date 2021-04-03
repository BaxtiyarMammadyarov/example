package az.mycompany.javalessons.testexaple;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("tam ededi daxil et: ");
        int i = scn.nextInt();
        double b = i / 10;
        System.out.print("rasional ededi daxil et: ");
        double j = scn.nextDouble();
        double a = j / 10;

        System.out.println("tam bolme :" + b + "\n" + "rasional bolme : " + a);
    }
}
