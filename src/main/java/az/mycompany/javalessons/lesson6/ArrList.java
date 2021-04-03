package az.mycompany.javalessons.lesson6;

public class ArrList {
    public static void main(String[] args) {

        int[] arr = {1789, 2035, 1899, 1456, 2013};
        int sum = 0;
        for (int i : arr)
            sum += i;


        System.out.println(sum);
    }
}
