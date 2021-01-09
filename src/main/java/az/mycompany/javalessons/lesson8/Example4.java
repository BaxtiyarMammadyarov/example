package az.mycompany.javalessons.lesson8;



import static az.mycompany.javalessons.lesson8.Example3.sumQuickDivisor;

public class Example4 {
    public static void main(String[] args) {
        prefectNumber(100);

    }
    public static void prefectNumber(int number){
        for (int i=1;i<number;i++)
             if (sumQuickDivisor(i)==i)
                 System.out.print(i+" ");
    }

}
