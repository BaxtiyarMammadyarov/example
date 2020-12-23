package az.mycompany.javalessons.testexaple;

public class PentagonalNumber {
    public static void main(String[] args) {
        pentagonalNum(10000);
        System.out.println("\n ---------------------------------------");

        pentagonalList(100);

    }

    public static void pentagonalNum(int number){
        int pentagonalnumber=1,index=1;

        while(pentagonalnumber<number){
            System.out.print(pentagonalnumber+"  ");
            pentagonalnumber = (pentagonalnumber + 1) + 3 *index;
             index+=1;
        }
    }

    public static void pentagonalList(int number){
        int pentagonalnumber =0;//pentagonalnum
        for(int i=0;i<number;i++){
            pentagonalnumber = (pentagonalnumber + 1) + 3 * i;
            System.out.print(pentagonalnumber+"  ");

        }

    }

}
