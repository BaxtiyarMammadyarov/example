package az.mycompany.javalessons.lesson8;

public class Example2 {
    public static void main(String[] args) {
          int number=235;
        System.out.println(maxSimpleNumber(number));
          if(maxSimpleNumber(number)<=5) System.out.println("Ugly number");
          else System.out.println("not ugly number");
    }
    public static int maxSimpleNumber(int number){
       int divide =2;

        while(divide <=number){
            if (number% divide ==0)
                   number = number / divide;
            else
                 divide++;
        }
        return divide;
   }

}
