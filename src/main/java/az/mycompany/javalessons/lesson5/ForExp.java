package az.mycompany.javalessons.lesson5;

import java.util.Scanner;

public class ForExp {
    public static void main(String[] args) {
        int sum = 0;
        String str;
        Scanner scn = new Scanner(System.in);
        System.out.print("bir eded daxil edin : ");
        int num = scn.nextInt();

        for (int i = 0; i < num; i++) {

            sum = sum + i;

        }
        System.out.println(sum);
    }
}
