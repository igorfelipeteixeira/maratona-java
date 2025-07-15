package academy.devdojo.maratonajava.javacore.formatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        LocalDate parse1 = LocalDate.parse("20250715", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);
        LocalDateTime parse2 = LocalDateTime.parse("2025-07-15T16:21:03.1299697", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse2);

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDateTime.now().format(dateTimeFormatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("15/07/2025", dateTimeFormatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyyy", Locale.GERMAN);
        String formatGR = LocalDateTime.now().format(dateTimeFormatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("15.Juli.02025", dateTimeFormatterGR);
        System.out.println(parseGR);
    }
}

