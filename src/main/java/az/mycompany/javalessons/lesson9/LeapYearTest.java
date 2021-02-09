package az.mycompany.javalessons.lesson9;

public class LeapYearTest {

    public static void main(String[] args) {
         leapYearTest(400);


    }
    public static void leapYearTest(int number){
        if (number%4==0) {
              if (number%100!=0) System.out.println("Leap year");
              else {
                    if (number%400!=0) System.out.println("Not a leap year");
                    else {
                        if (number%4000==0) System.out.println("Not a leap year");
                        else System.out.println("Leap year");
                    }
              }

        }
        else System.out.println("Not a leap year");


    }
}
