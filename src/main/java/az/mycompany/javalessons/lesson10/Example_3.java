package az.mycompany.javalessons.lesson10;

import static az.mycompany.javalessons.lesson10.Example_2.addSpace;

public class Example_3 {


    public static void main(String[] args) {
        String result = "";
        int number = 10;
        for (int i = 1; i <= number; i += 2) {
            result += addSpace((number - i) / 2);
            for (int j = 1; j <= i; j++)
                result += "*";

            System.out.println(result);
            result = "";
        }
        for (int i = number; i > 0; i -= 2) {
            result += addSpace((number - i) / 2);
            for (int j = 1; j < i; j++)
                result += "*";

            System.out.println(result);
            result = "";
        }
    }
}
