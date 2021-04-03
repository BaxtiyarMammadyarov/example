package az.mycompany.javalessons.lesson9;


public class Exapmle3 {


    public static void main(String[] args) {
        long starttime = System.nanoTime();
        int number = 1000;
        showMatrix(number);
        long endtime = System.nanoTime();
        System.out.println("\n" + (endtime - starttime) / 100000000);
    }

    public static void showMatrix(int number) {
        int[][] matris = new int[number][number];
        for (int i = 0; i < number; i++) {
            System.out.println();
            for (int j = 0; j < number; j++) {
                matris[i][j] = (int) (Math.random() * 100);
                System.out.print(matris[i][j] + " ");
            }
        }

    }

}
