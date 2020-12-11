package az.mycompany.javalessons.lesson123;

import java.util.Scanner;

public class ConvertTip {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int id = scn.nextInt();
        boolean bool = !(id == ((int) Math.random() * 101));
        System.out.println(bool);
    }
}
