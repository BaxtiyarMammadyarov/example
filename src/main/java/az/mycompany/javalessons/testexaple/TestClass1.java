package az.mycompany.javalessons.testexaple;

public class TestClass1 {
    public static void main(String[] args) {
         int j=0;
        for(int i=1000;i<=10000;i++){
         //   int a=((i/100)/10)+((i/100)%10);
         //   int b=((i%100)/10)+((i%100)%10);
         if   (((i/100)/10)+((i/100)%10)==((i%100)/10)+((i%100)%10)) {
             System.out.println(i);
             j++;
         }
        }
        System.out.println(j);
    }
}
