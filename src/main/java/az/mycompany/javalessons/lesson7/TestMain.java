package az.mycompany.javalessons.lesson7;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(factorial(0));

    }
    public static int factorial(int number){
       if (number==0) return 1;
      else if (number==1) return 1;
      else return number*factorial(number-1);

    }
}
