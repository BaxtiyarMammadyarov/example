package az.mycompany.javalessons.lesson11;

import java.time.LocalTime;


public class Example_2_1 {
    public static void main(String[] args) {
        LocalTime starttime=LocalTime.now();
        int[] age=new int[100000000];
        int[] count_age =new int[150];

        for (int i=1;i<=age.length;i++)
            age[i-1]=((int)(Math.random()*150));

        for (int i:age)
            count_age[i]=(count_age[i]==0)?1:count_age[i]+1;

        for(int i=0;i<count_age.length;i++)
            System.out.println((i+1)+" : "+count_age[i]);

        LocalTime endtime=LocalTime.now();
        System.out.println(starttime+" : "+endtime);
    }
}
