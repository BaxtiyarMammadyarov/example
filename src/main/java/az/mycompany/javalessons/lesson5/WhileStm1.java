package az.mycompany.javalessons.lesson5;

import java.util.Scanner;

public class WhileStm1 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int i=0,j=0,k=0;
        String exit;

        while(true){
            System.out.print("ededi daxil edin :");
            int num=scn.nextInt();

            if(num>0) {i=i+1;
                System.out.print("Davam etme isteyirsiz : (y/n): ");
                exit=scn.next();
                if (exit.equals("y")) {
                    continue;
                }
                else if (exit.equals("n")) {
                    System.out.println("musbet : "+i+"\n"+"menfi : "+j+"\n"+"sifir: "+k);
                    break;}

            }
            else if(num<0){ j=j+1;
                System.out.print("Davam etme isteyirsiz : (y/n): ");
                exit=scn.next();
                if (exit.equals("y")) {
                    continue;
                }
                else if (exit.equals("n")) {
                    System.out.println("musbet : "+i+"\n"+"menfi : "+j+"\n"+"sifir: "+k);
                    break;}
            }
            else if(num==0) {k=k+1;
                System.out.print("Davam etme isteyirsiz : (y/n): ");
                exit=scn.next();
                if (exit.equals("y")) {
                    continue;
                }
                else if (exit.equals("n")) {
                    System.out.println("musbet : "+i+"\n"+"menfi : "+j+"\n"+"sifir: "+k);
                    break;}
            }

        }




        }
    }

