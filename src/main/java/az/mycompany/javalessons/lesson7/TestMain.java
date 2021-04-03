package az.mycompany.javalessons.lesson7;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(factorial1(4));
        System.out.println("salam dunya");
    }

    public static int factorial(int number) {
        if (number == 0) return 1;
        else if (number == 1) return 1;
        else return number * factorial(number - 1);

    }

    public static int factorial1(int number) {
        return (number > 1) ? number * factorial1(number - 1) : 1;
    }

}
