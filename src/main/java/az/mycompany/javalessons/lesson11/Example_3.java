package az.mycompany.javalessons.lesson11;

public class Example_3 {
    public static void main(String[] args) {
        pellNumper(15);

    }

    public static void pellNumper(int number) {
        int[] arr = new int[number];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++)
            arr[i] = arr[i - 1] * 2 + arr[i - 2];

        for (int j : arr)
            System.out.print(j + " ");
    }
}
