package az.mycompany.javalessons.lesson8;

public class Example5 {
    public static void main(String[] args) {
        kaprekarNumber(703);
        System.out.println("-----------------");
        kaprekarNumber(45);
        System.out.println("-----------------");
        kaprekarNumber(9);

    }

    public static void kaprekarNumber(int number) {

        String strnum = Integer.toString(number * number);
        int num1 = Integer.parseInt(strnum.substring(0, strnum.length() / 2));
        int num2 = Integer.parseInt(strnum.substring(strnum.length() / 2));
        System.out.println(num1 + num2);
        if ((num1 + num2) == number) System.out.println(number + " is a Kaprekar Number");
        else System.out.println(number + " is not a Kaprekar Number");
    }
}
