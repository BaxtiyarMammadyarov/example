package az.mycompany.javalessons.lesson9;


import static az.mycompany.javalessons.lesson9.LeapYearTest.leapYearTest;

public class Lesson9 {
    public static void main(String[] args) {
       Matrix matrix = new Matrix();
       matrix.setMatrix(4);
       matrix.showMatrix();
        leapYearTest(1000);
    }
}
