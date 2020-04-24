package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formating {

    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1= LocalTime.of(10,00);
        LocalTime time2= LocalTime.of(12,00);
        System.out.println(time1.format(dtf));
        System.out.println(time1.isAfter(time2));

    }

}
