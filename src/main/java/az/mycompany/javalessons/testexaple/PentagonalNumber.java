package az.mycompany.javalessons.testexaple;

public class PentagonalNumber {
    public static void main(String[] args) {
        PentagonalNum1(1000);
        System.out.println("\n ---------------------------------------");

        PentagonalList(25);

    }

    public static void PentagonalNum1(int number){
        int pentagonalnumber=1,index=1;

        while(pentagonalnumber<number){
            System.out.print(pentagonalnumber+"  ");
            pentagonalnumber = (pentagonalnumber + 1) + 3 *index;
             index+=1;
        }
    }

    public static void PentagonalList(int number){
        int pentagonalnumber =1;//pentagonalnum
        System.out.print(pentagonalnumber );
        for(int i=1;i<number;i++){

            pentagonalnumber = (pentagonalnumber + 1) + 3 * i;

            System.out.print("  "+pentagonalnumber );
        }

    }

}
