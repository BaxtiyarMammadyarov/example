package az.mycompany.javalessons.testexaple;

import java.util.Scanner;

public class EdedSual1 {
    public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    int positive=0,negative=0,zero=0;
    boolean bool1=true;
        while(bool1){
            boolean bool2=true;
        System.out.print("Ededi daxil edin : ");
        int number=scn.nextInt();
        if(number>0) positive+=1;
        else if(number<0) negative+=1;
        else zero+=1;
        while(bool2) {
            System.out.print("Programdan ayrilmaq isteyirsiz mi? :(y/n) ");
            String answer = scn.next();
            if(answer.equals("n")) bool2=false;
            else if(answer.equals("y")){
                System.out.println("Positive number: "+positive+"\n"+"Negative number: "+negative+"\n"+"Zero number: "+zero);
                bool1=false;
                bool2=false;
            }
            else {
                System.out.println("Secim duzgun deyil : (y / n)");
                bool2=true;
            }
        }
    }
}
}
