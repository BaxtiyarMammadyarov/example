package az.mycompany.javalessons.leesson10;

import sun.util.resources.CalendarData;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_1 {

    public static void main(String[] args) {

        LocalDate localDate=LocalDate.MAX;
        LocalDate localDate1=LocalDate.now();
        Calendar calendar=new GregorianCalendar(9999999,12,31);

        System.out.println(calendar.getWeeksInWeekYear());

    }
}
