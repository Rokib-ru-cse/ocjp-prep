package chaptereight.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String inputDate1 = "2023-10-11";
        Date date1 = dateFormat.parse(inputDate1);
        System.out.println("Parsed Date 1: " + date1);

        String inputDate2 = "23-10-11";
        Date date2 = dateFormat.parse(inputDate2);
        System.out.println("Parsed Date 2: " + date2);

    }
}
