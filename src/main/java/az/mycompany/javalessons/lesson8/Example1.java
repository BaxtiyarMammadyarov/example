package az.mycompany.javalessons.lesson8;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numberarray = {5, 7, 1, 9, -10, 10, 2};
        firstTwoMinNumberArray(numberarray);
        /*
         *
         *
         * */

    }

    public static void firstTwoMinNumberArray(int[] numberarray) {
        Arrays.sort(numberarray);
        System.out.println("Smallest element is : " + numberarray[0] + "\n" + "Second smallest element is: " + numberarray[1]);

    }

}
