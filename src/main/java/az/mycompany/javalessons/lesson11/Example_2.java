package az.mycompany.javalessons.lesson11;import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
;

public class Example_2 {
    public static void main(String[] args) {
        LocalTime starttime=LocalTime.now();
        int[] array=new int[100000000];

        Map<Integer,Integer> map=new HashMap<>();
     for (int i=1;i<=array.length;i++)
               array[i-1]=((int)(Math.random()*150))+1;


        for (int j:array)
            map.put(j,(map.get(j)==null)? 1:map.get(j)+1);

            int sum=0;
       for (int i=1;i<=150;i++){
           System.out.println(i+" : "+map.get(i));
           sum+=map.get(i);
       }
        System.out.println(sum);
       LocalTime endtime=LocalTime.now();
        System.out.println(starttime+" : "+endtime);
    }
}
