package az.mycompany.javalessons.lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        int result;

        try {
            System.out.print("birinci ededidaxil et: ");
            number1 = scanner.nextInt();
            System.out.print("ikinci ededi daxil et: ");
            number2 = scanner.nextInt();
            result = number1 / number2;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("daxil edilen eded Integer tipli deyil \n" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("bolen sifir daxil edilib \n" + e.getMessage());

        } catch (Exception e) {
            System.out.println("sehv oldu :" + e.getMessage());
        } finally {
            System.out.println("tetbiqi yeniden basladin ve deyerleri duzgun daxil edin!!! ");
        }

        // InputMismatchException
        //ArithmeticException

    }
}
