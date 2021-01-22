package az.mycompany.javalessons.lesson10;

public class Example_2 {
    public static void main(String[] args) {
        pyramidShow(200);

    }
    public static String addSpace(int number){
        String str ="";
        for (int i =0;i<number;i++)
            str+=" ";
        return str;}

    public static void pyramidShow(int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            if (i ==1) System.out.println(addSpace(((count - i) * 2 )) + i+ addSpace(((count - i) * 2 )));
            else if(i==count) {
                  result+=i;
                for (int j = 1; j < i; j++)
                    result += addSpace(Integer.toString(count).length() + 1 - Integer.toString(i).length()) + i;
                System.out.println(result);
            }
            else {
                result += addSpace((count - i) * 2 ) ;
                for (int j = 1; j <= i; j++)
                    result +=i+ addSpace(Integer.toString(count).length() +1 - Integer.toString(i).length()) ;
                result+= addSpace(((count - i) * 2 ));
                System.out.println(result);
            }

                result = "";

        }

    }



    }


