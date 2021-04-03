package az.mycompany.javalessons.lesson12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        Integer[][] matris = new Integer[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matris[i][j] = (int) (Math.random() * 10);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matris[i][j] + " ");
            System.out.println();
        }

        int a = matris[1][2];
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matris[i][j] == a) {
                    Integer[] arr = {i, j};
                    list.add(arr);
                }
            }

        }

        for (Integer[] integer : list) {
            for (int i : integer)
                System.out.print(i);
            System.out.println();
        }
    }
}
