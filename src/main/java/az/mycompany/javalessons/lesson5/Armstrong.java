package az.mycompany.javalessons.lesson5;

public class Armstrong {
    public static void main(String[] args) {
        int s=0;
        for(int i=1;i<=500;i++){
            int b=i;
          while(b>0) {
              int a = b % 10;
               b = i / 10;
              s=s+a*a*a;          }
          if(s==i){
              System.out.println(i);

          }

        }
    }
}
