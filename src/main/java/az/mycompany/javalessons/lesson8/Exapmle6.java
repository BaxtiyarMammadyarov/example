package az.mycompany.javalessons.lesson8;



import static az.mycompany.javalessons.lesson8.Example3.sumQuickDivisor;

public class Exapmle6 {
    public static void main(String[] args) {
        deficientNumber(45);


    }
    public static void deficientNumber(int  number){

      if (sumQuickDivisor(number)<number) System.out.println(number+" is a deficient number");
      else System.out.println(number+" is not a deficient number");

    }
}
