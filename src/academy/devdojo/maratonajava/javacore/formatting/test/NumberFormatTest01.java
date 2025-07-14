package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeFR = Locale.FRANCE;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeUS);
        numberFormats[2] = NumberFormat.getInstance(localeJP);
        numberFormats[3] = NumberFormat.getInstance(localeFR);
        double value = 1_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String valueString = "1000.2130";
        try {
            System.out.println(numberFormats[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
