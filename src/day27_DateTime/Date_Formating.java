package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formating {
    public static void main(String[] args) {


        DateTimeFormatter dff=DateTimeFormatter.ofPattern("EEEE MMMM yyyy");

        //LocalDate date2=LocalDate.of(1999,12,25);
      //  System.out.println(date2);
                LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dff));

    }
}
