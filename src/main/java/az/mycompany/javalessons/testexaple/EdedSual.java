package az.mycompany.javalessons.testexaple;


import java.util.Scanner;

public class EdedSual {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        boolean bool = true;
        while (bool) {
            System.out.print("Ededi daxil edin : ");
            int number = scn.nextInt();
            if (number > 0) positive += 1;
            else if (number < 0) negative += 1;
            else zero += 1;
            bool = false;
            while (!bool) {
                System.out.print("Programdan ayrilmaq isteyirsiz mi? :(y/n) ");
                String answer = scn.next();
                if (answer.equals("n")) bool = true;
                else if (answer.equals("y")) {
                    System.out.println("Positive number: " + positive + "\n" + "Negative number: " + negative + "\n" + "Zero number: " + zero);
                    break;
                } else {
                    System.out.println("Secim duzgun deyil : (y / n)");
                    bool = false;
                }
            }


        }
    }
}
