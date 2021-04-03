package az.mycompany.javalessons.lesson12;


import java.util.function.BiConsumer;

public class LambdaExeption {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addConsumer = (a, b) -> System.out.println("add:" + (a + b));
        BiConsumer<Integer, Integer> subConsumer = (a, b) -> System.out.println("sub: " + (a - b));
        BiConsumer<Integer, Integer> mulConsumer = (a, b) -> System.out.println("Mul: " + (a * b));

        addConsumer.accept(4, 5);
        subConsumer.accept(5, 6);
        mulConsumer.accept(8, 4);

    }
}
