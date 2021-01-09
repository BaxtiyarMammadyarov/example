package az.mycompany.javalessons.lesson8;

public class Example3 {
    public static void main(String[] args) {

        System.out.println(sumDivisor(25));
        System.out.println("-------------------------");
        System.out.println(sumQuickDivisor(25));
        System.out.println("--------------------------");
        abundantNumber(25);
    }
  public static int sumDivisor(int number){
        int loopcount=0;
        int divisorsum=0;
        for(int i=1;i<number;i++) {
            if (number % i == 0)
                divisorsum += i;
           loopcount=i;
        }
      System.out.println("dovr sayi :"+loopcount);
        return divisorsum;

  }


   public static int sumQuickDivisor(int number){
        int divid=1;
        int olddivid=0;
        boolean loop=true;
        int sum=0;
        int loopcount=0;
        while(loop) {
            loopcount++;
            if (number % divid == 0) {
                  if (number/divid==olddivid) loop=false;
                  else {  olddivid=divid;
                             if(divid==number/divid) {
                                 sum+=divid;
                                 loop=false;
                             }else  sum+=divid+number/divid;
                      divid++;
                  }
            } else divid++;
        }
       System.out.println("dovr sayi : "+loopcount);
        return sum-number ;
    }
    public  static void abundantNumber(int number) {
        if (sumQuickDivisor(number) > number) System.out.println(number + " is a abundant number ");
        else System.out.println(number + " is not a abundant number ");


    }
}

