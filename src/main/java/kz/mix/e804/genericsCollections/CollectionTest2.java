//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections;

import java.util.*;

public class CollectionTest2 {
    public static void main(String[] args) {
        List<Object[]> d = new ArrayList<Object[]>();

        // инициализация массива - некорректный синтаксис. Запись {} допустима только с оператором new
        // d.add({"A"});

        // тут наоборот нужна инициализация массива, или необходимо указать его длину
        // d.add(new Object[]);

        d.add(new Object[1]);
        d.add(new Object[] { "A" });

        // необходимо что-то одно: или инициализация мпссива или его размер
        // d.add(new Object[1]{"A"});

        d.add("A".split("B"));

        for (Object[] o : d) {
            System.out.println(Arrays.toString(o));
        }
    }
}
