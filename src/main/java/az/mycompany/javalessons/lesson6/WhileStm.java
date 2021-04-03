package az.mycompany.javalessons.lesson6;

import java.util.Scanner;

public class WhileStm {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        String netice = "";
        String sual = null;
        while (true) {
            System.out.print("eded daxil edin : ");
            int num = scn.nextInt();
            netice = netice + num + "  ";
            System.out.print("programdan ayrilmaq isteyirsiniz mi ? : (y/n) ");
            sual = scn.next();
            if (sual.equals("y")) break;
            else continue;


        }
        System.out.println("cavab : " + netice);
    }
}
