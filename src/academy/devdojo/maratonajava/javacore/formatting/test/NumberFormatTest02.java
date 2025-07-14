package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeFR = Locale.FRANCE;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeUS);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeFR);
        double value = 1000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(value));
        }

        String valueString = "$1,000.21";
        try {
            System.out.println(numberFormats[1].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
