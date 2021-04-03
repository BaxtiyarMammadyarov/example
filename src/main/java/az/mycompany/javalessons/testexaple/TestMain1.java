package az.mycompany.javalessons.testexaple;

public class TestMain1 {
    public static void main(String[] args) {

        for (int i = 1000; i < 10000; i++) {
            int digit1 = Integer.parseInt(Integer.toString(i).substring(0, 1));
            int digit2 = Integer.parseInt(Integer.toString(i).substring(1, 2));
            int digit3 = Integer.parseInt(Integer.toString(i).substring(2, 3));
            int digit4 = Integer.parseInt(Integer.toString(i).substring(3, 4));

            if (digit1 + digit2 == digit3 + digit4) {
                System.out.println(i);

            }

        }

    }
}
