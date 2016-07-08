//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections;

import java.util.NavigableMap;
import java.util.TreeMap;

// результат - NullPointerException
// понять почему, разобраться с данными методами: lowerKey, higherKey и т.д.
// + first, last
public class NavMapEx {
    public static void main(String[] args) {
        NavigableMap<String, Integer> navmp = new TreeMap<>();
        navmp.put("one", 1);
        navmp.put("two", 2);
        navmp.put("three", 3);
        navmp.put("four", 4);
        navmp.put("five", 5);
        navmp.put("six", 6);

        String[] ob = new String[]{
                navmp.lowerKey("five"),
                navmp.higherKey("five"),
                navmp.ceilingKey("five"),
                navmp.floorKey("five")
        };

        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i].toString() + ", ");
        }
    }
}
