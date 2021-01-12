package az.mycompany.javalessons.lesson9;

import java.util.stream.LongStream;

public class Lesson9 {
    public static void main(String[] args) {
        int number=99;
        long sum=LongStream.range(1,(number+1)/2).filter(i->number%i==0 && number!=i).sum();
        System.out.println(sum);
    }
}
