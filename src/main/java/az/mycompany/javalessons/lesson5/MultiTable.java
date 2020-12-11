package az.mycompany.javalessons.lesson5;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.print("eded daxil edin : ");
        int num=scn.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(i + "*" + num + " = " + (num * i));
        }
    }
}
