package az.mycompany.javalessons.lesson6;

import java.util.Scanner;

public class ATestMain2 {
    public static void main(String[] args) {
        int [] arr={12,3,65,6,9,78};
        Scanner scn=new Scanner(System.in);
        System.out.print("Ededi daxil edin : ");
        int number=scn.nextInt();
        boolean bool=true;
        int i=0;
        while(bool){
            if((number==arr[i])){
                System.out.println("daxil etdiyiniz eded massivvde var ve indeksi "+i);
                bool=false;
            }
            else {i++;
                if (i ==arr.length) {bool=false;
                    System.out.println("daxil olan eded massivde yoxdur :");
                }
            }

        }

    }
}
