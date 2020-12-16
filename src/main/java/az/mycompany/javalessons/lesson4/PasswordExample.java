package az.mycompany.javalessons.lesson4;

import java.util.Scanner;

public class        PasswordExample {
    public static void main(String[] args) {

        String password;
        Scanner scn = new Scanner(System.in);
        System.out.println("Sifre boyuk herle baslamali ,8 simvoldan az olmamali ve reqem daxil olmalidir :");
        System.out.print("Shifreni daxil edin : ");
        password = scn.nextLine();
        int firstchar = password.charAt(0);
        if ((firstchar >= 65) && (firstchar <= 90) && (password.length() >7)) {
            int i = 1;
            while (true) {

                if (((int) password.charAt(i) < 58) && ((int) password.charAt(i) > 47)) {
                    System.out.println("sifre testiqlendi !!!");
                    break;
                }

                else   {  System.out.println(password.charAt(i)+" : "+i);


                         if (i==password.length()-1) {
                           System.out.println("sifreye reqem daxil deyil");
                           break;

                       }
                    i++;
                }


            }


        } else
                System.out.println("Sifre boyuk herfle,8 simvol olmali ve reqem daxil olmalidir");

 }
}


