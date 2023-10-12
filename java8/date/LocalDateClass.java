package java8.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateClass {
    public static int aVoid() {
        try {

            throw new Exception("xx");
        } catch (Exception e) {
            System.out.println("from catch");
            return 0;
        } finally {
            System.out.println("from finally");
        }
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
        aVoid();

    }
}
