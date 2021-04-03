package az.mycompany.javalessons.lesson9;

import java.util.Scanner;

public class ExamplePassword {
    private String password;

    public void setPassword(String password) {
        if (checkPassword(password)) {
            this.password = password;
            System.out.println("parol qeyde alindi ");
        } else System.out.println("Sifre telebere uygun deyil");
    }

    public String getPassword() {
        return this.password;
    }

    public int countDigit(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) > 47 && str.charAt(i) < 58) count++;
        return count;
    }

    public boolean checkString(String str) {
        boolean answer = false;
        int index = 0;
        while (index < str.length()) {
            if (str.toUpperCase().charAt(index) > 90) {
                answer = false;
                break;
            } else if (str.charAt(index) < 48) {
                answer = false;
                break;
            } else if (str.charAt(index) > 57 && str.charAt(index) < 65) {
                answer = false;
                break;
            } else {
                answer = true;
                index++;
            }

        }
        return answer;
    }

    public boolean checkPassword(String str) {
        if (str.length() < 10) return false;
        else return checkString(str) && countDigit(str) > 1;
    }


    public static void main(String[] args) {
        ExamplePassword password = new ExamplePassword();
        Scanner scn = new Scanner(System.in);
        System.out.print("Parolu daxil edin :");
        String parol = scn.next();
        System.out.println(password.countDigit(parol));
        System.out.println(password.checkString(parol));
        password.setPassword(parol);

    }
}
