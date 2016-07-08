//CHECKSTYLE:OFF
package kz.mix.e804.localization;

import java.util.Locale;

public class LocaleTest1 {
    public static void main(String[] args) {
        // ничего не выведет - почему?
        Locale.setDefault(Locale.UK);
        Locale lc = new Locale("gb");
        System.out.println(lc.getDisplayCountry());
        System.out.println(lc.getDisplayLanguage());

        //а вот так будет вывод United Kingdom
        Locale lc1 = new Locale("en", "gb");
        System.out.println(lc1.getDisplayCountry());

        Locale lc2 = new Locale("en");
        System.out.println(lc2);
        System.out.println(lc2.getDisplayLanguage());
    }
}
