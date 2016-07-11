//CHECKSTYLE:OFF
package kz.mix.e804.localization;

import java.util.Locale;

public class LocaleTest1 {
    public static void main(String[] args) {
        // Установка дефолтной локали на английский, Британия
        Locale.setDefault(Locale.UK);

        // Создание новой локали - не корректно. Ошибки компиляции не будет, но такого языка нет - "gb"
        Locale lc = new Locale("gb");
        System.out.println(lc);
        // и следовательно, так язык для такой локали не найдет, выведет то, что задано, т.е. "gb"
        System.out.println(lc.getDisplayLanguage());
        // т.к. страна не задана, то вывод будет пустым
        System.out.println(lc.getDisplayCountry());

        System.out.println("--------------");

        //а вот правильная локаль для United Kingdom
        Locale lc1 = new Locale("en", "gb");
        System.out.println(lc1);
        // Выведет полное название языка в текущей локали
        System.out.println(lc1.getDisplayLanguage());
        // Выведет полное название страны в текущей локали
        System.out.println(lc1.getDisplayCountry());

        System.out.println("--------------");

        Locale lc2 = new Locale("en");
        System.out.println(lc2);
        System.out.println(lc2.getDisplayLanguage());
        System.out.println(lc2.getDisplayCountry());

        System.out.println("--------------");
    }
}
