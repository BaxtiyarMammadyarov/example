package az.mycompany.javalessons.lesson9;

import java.util.Scanner;

public class PasswordExample {
    private String password;

    public void setPassword(String shifre) {
        if (passwordCheck(shifre)) {
            password = shifre;
            System.out.println("Parol qeyde alindi");
        } else System.out.println("parol teleblere uygun deyil");

    }

    private boolean passwordCheck(String str) {
        boolean answer = false;
        int count = 0;
        if (str.length() >= 10) {
            for (char i : str.toCharArray()) {
                if (Character.isDigit(i)) {
                    count++;
                    if (count > 1 && count < str.length())
                        answer = true;
                } else if (!Character.isAlphabetic(i)) {
                    answer = false;
                    break;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PasswordExample pass = new PasswordExample();
        Scanner scn = new Scanner(System.in);
        System.out.print("Parolu daxil edin : ");
        String password = scn.next();
        pass.setPassword(password);


    }
}
