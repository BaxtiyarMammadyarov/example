package az.mycompany.javalessons.leesson10;

import static az.mycompany.javalessons.leesson10.Example_2.addSpace;

public class Example_4 {
    public static void main(String[] args) {
        String result = "";
        int number =11;
        int index = 0;
        int say = 0;
        for (int i = 1; i <= number; i += 2) {
            result += addSpace((number - i) / 2);
            for (int j = 1; j <= i; j++) {
                if (j <= ((i + 1) / 2)) {
                    result += Character.toString((char) (64 + j));
                    index = 64 + j;
                } else {
                    say++;
                    result += Character.toString((char) (index   - say));

                }
            }
            System.out.println(result);
            result = "";
            index = 0;
            say=0;
        }

        for (int i = number; i >0; i -= 2) {
            result += addSpace((number - i) / 2);
            for (int j = 1; j <= i; j++) {
                if (j <= ((i + 1) / 2)) {
                    result += Character.toString((char) (64 + j));
                    index = 64 + j;
                } else {
                    say++;
                    result += Character.toString((char) (index - say));
                }
            }
            System.out.println(result);
            result = "";
            index = 0;
            say=0;
        }
    }

    }


