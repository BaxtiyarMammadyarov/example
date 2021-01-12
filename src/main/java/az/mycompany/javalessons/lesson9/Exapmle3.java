package az.mycompany.javalessons.lesson9;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exapmle3 {




    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("martisin olcunu daxil edin : ");
        int number =scn.nextInt();
        showMatrix(number);


    }
    public static void showMatrix(int number){
        int[][] matris=new int[number][number];
        for (int i=0;i<number;i++) {
            System.out.println();
            for (int j = 0; j < number; j++){
                matris[i][j] = (int) (Math.random() * 100);
                System.out.print(matris[i][j]+" ");
            }
        }

    }

}
