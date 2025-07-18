package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        Period period1 = Period.between(now, nowAfterTwoYears);
        Period period2 = Period.ofDays(10);
        Period period3 = Period.ofWeeks(60);
        Period period4 = Period.ofMonths(7);
        Period period5 = Period.ofYears(3);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(Period.between(now, now.plusDays(period3.getDays())));
        System.out.println(now.until(now.plusDays(period3.getDays()), ChronoUnit.YEARS));
    }
}
