package az.mycompany.javalessons.lesson10;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Example_1 {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.MAX;
        LocalDate localDate1=LocalDate.now();
        Calendar calendar=new GregorianCalendar();
        System.out.println(localDate.getYear()-localDate1.getYear());
        System.out.println((localDate.getYear()-localDate1.getYear())*12);
        long countweek=calendar.getWeekYear();
        for (int i=localDate1.getYear();i<=localDate.getYear();i++){
              calendar.add(calendar.YEAR,1);
              countweek+=calendar.getWeekYear();
        }
        System.out.println(countweek);
        }



}
