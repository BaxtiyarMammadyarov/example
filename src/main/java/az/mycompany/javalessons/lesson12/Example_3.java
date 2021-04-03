package az.mycompany.javalessons.lesson12;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Example_3 {


    public static void main(String[] args) {
        Integer[][] matrix = new Integer[3][3];


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) (Math.random() * 10);

            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();

            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");

            }
        }
        Integer a = matrix[1][2];
        System.out.println(a);

        Arrays.stream(matrix)
                .filter(s -> {
                    boolean bool = false;
                    for (Integer[] integers : matrix) {
                        for (Integer integer : integers)
                            if (integer == a) bool = true;


                    }

                    return bool;
                }).collect(Collectors.toList()).forEach(System.out::println);
    }
}










