//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections;

import java.util.TreeSet;

public class CollectionTest1 {
    public static void main(String[] args) {
        TreeSet<CollectionTest1> at = new TreeSet<>();
        at.add(new CollectionTest1());
        at.add(new CollectionTest1());
        at.add(new CollectionTest1());

        // ClassCatException - CollectionTest1 не реализует интерфейс Comparable
        System.out.println(at.first());
    }
}
