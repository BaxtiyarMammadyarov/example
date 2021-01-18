package az.mycompany.javalessons.leesson10;

import static az.mycompany.javalessons.leesson10.Example_2.bosluq;

public class Example3 {
    public static void main(String[] args) {
        pyramidShow(5);

    }
    public static void pyramidShow(int count) {
        String result = "";
        for (int i = 1; i<=count; i++) {
            if(i==count) {
                result+="*";
                for (int j=1;j<=count;j++)
                    result+=bosluq(1)+"*";
            }
            else if(i==1) result+=bosluq(count+1-i)+"*";
            else {
                result+=bosluq(count-i);
                for (int j=1;j<=i;j++)
                    result+=bosluq(1)+"*";

            }

            System.out.println(result);
            result = "";

        }
        for (int i = count; i >0; i--) {
           if(i==count) {
               result+="*";
               for (int j=1;j<=count;j++)
                   result+=bosluq(1)+"*";
           }
           else if(i==1) result=(bosluq(count+1-i)+"*");
           else {
               result+=bosluq(count-i);
               for (int j=1;j<=i;j++)
                     result+=bosluq(1)+"*";

           }

            System.out.println(result);
            result = "";

        }

    }
}
