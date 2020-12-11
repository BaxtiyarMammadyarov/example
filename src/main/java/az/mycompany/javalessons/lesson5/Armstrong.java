package az.mycompany.javalessons.lesson5;

public class Armstrong {
    public static void main(String[] args) {

        for(int i=1;i<=500;i++){
            int a=i/100;
            int b=(i%100)/10;
            int c=((i%100)%10);
              a=a*a*a+b*b*b+c*c*c;
          if(i==a) {
              System.out.println(i);
          }

          }

        }
    }

