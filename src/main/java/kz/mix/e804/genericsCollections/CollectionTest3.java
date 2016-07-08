//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTest3 {
    public static void main(String[] args) {
        TreeSet<String> mts = new TreeSet<String>();
        mts.add("one");
        mts.add("two");
        mts.add("three");
        mts.add("four");
        mts.add("five");

//        Ошибка копиляции
//        NavigableSet<String> tas = mts.tailSet("three");

        // Нужно так:
        NavigableSet<String> tas = mts.tailSet("three", true);

        // Или так
        SortedSet<String> tas2 = mts.tailSet("three");

        for (String st : mts) {
            System.out.print(st + " ");
        }
        System.out.println();
        for (String st : tas) {
            System.out.print(st + " ");
        }
        System.out.println();
        for (String st : tas2) {
            System.out.print(st + " ");
        }
    }
}
