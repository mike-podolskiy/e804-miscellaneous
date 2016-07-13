//CHECKSTYLE:OFF
package kz.mix.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {

        // Стандартный способ
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println(names);

        // С помощью лямбды в java 8
        List<String> cities = Arrays.asList("London", "Paris", "Moscow", "Berlin");

        Collections.sort(cities, (String a, String b) -> {
            return a.compareTo(b);
        });

        System.out.println(cities);

        // Можно сократить, для однострочных методов можно убрать {} и return
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        System.out.println(names);

        // Компилятору известны типы параметров, их тоже можно опустить
        Collections.sort(cities, (a, b) -> b.compareTo(a));

        System.out.println(cities);

    }
}
