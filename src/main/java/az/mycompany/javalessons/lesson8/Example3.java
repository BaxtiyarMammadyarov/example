package az.mycompany.javalessons.lesson8;

public class Example3 {
    public static void main(String[] args) {


        System.out.println("-------------------------");
        System.out.println(sumDivisor(99));
        System.out.println("--------------------------");
        abundantNumber(99);
    }


    public static int sumDivisor(int number) {
        int divid = 1;
        int olddivid = 0;
        boolean loop = true;
        int sum = 0;
        int loopcount = 0;
        while (loop) {
            loopcount++;
            if (number % divid == 0) {
                if (number / divid == olddivid) loop = false;
                else if (number / divid == divid) {
                    sum += divid;
                    loop = false;
                } else {
                    sum += divid + number / divid;
                    olddivid = divid;
                    divid++;
                }
            } else divid++;
        }
        System.out.println("dovr sayi : " + loopcount);
        return sum - number;
    }

    public static void abundantNumber(int number) {
        if (sumDivisor(number) > number) System.out.println(number + " is a abundant number ");
        else System.out.println(number + " is not a abundant number ");


    }
}

