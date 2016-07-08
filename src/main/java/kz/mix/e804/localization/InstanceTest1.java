//CHECKSTYLE:OFF
package kz.mix.e804.localization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class InstanceTest1 {
    public static void main(String[] args) {
        // нет такого метода у класа
        // Date.getInstance(new Locale(""));

        // нет такого метода у класа
        // Locale.getInstance(new Locale(""));

        Calendar.getInstance(new Locale(""));

        // есть метод getInstance(void), а не getInstance(Locale)
        // DateFormat.getInstance(new Locale(""));

        NumberFormat.getInstance(new Locale(""));
    }
}
