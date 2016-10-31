package kz.mix.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class StreamTest3 {
    private static Collection<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
    private static Collection<String> nonOrdered = new HashSet<>(ordered);

    public static void main(String[] args) {
        // Получение коллекции без дубликатов из неупорядоченного стрима
        // [a1, a2, a3] — порядок не гарантируется
        System.out.println(nonOrdered.stream().distinct().collect(Collectors.toList()));

        // Получение коллекции без дубликатов из упорядоченного стрима
        // [a1, a2, a3] — порядок не гарантируется
        System.out.println(ordered.stream().distinct().collect(Collectors.toList()));
    }
}
