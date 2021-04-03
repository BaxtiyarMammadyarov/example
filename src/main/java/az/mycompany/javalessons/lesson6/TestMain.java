package az.mycompany.javalessons.lesson6;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String netice = "";
        String sual = null;
        do {
            System.out.print("eded daxil edin : ");
            int num = scn.nextInt();
            netice = netice + num + "  ";
            System.out.print("programdan ayrilmaq isteyirsiniz mi ? : (y/n) ");
            sual = scn.next();


        } while (!(sual.equals("y")));
        System.out.println("cavab : " + netice);
    }
}
