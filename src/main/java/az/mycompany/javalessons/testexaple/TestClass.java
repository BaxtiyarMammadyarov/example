package az.mycompany.javalessons.testexaple;

public class TestClass {

    public static void main(String[] args) {
        int j=0;
        for(int i=1000;i<=9999;i++){
            int a=i/1000;
            int b=(i%1000)/100;
            int c=((i%1000)%100)/10;
            int d=((i%1000)%100)%10;
            if((a+b)==(c+d)){
                System.out.println(i);
                j+=1;
            }
            }
        System.out.println("count : "+j);
    }
}
