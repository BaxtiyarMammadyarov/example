package az.mycompany.javalessons.testexaple;

public class TestMain1 {
    public static void main(String[] args) {
        Integer num;
        for(num=1000;num<10000;num++){
            int digit1=Integer.parseInt(num.toString().substring(0,1));
            int digit2=Integer.parseInt(num.toString().substring(1,2));
            int digit3=Integer.parseInt(num.toString().substring(2,3));
            int digit4=Integer.parseInt(num.toString().substring(3,4));
            if(digit1+digit2==digit3+digit4){
                System.out.println(num);

            }

        }

    }
}
