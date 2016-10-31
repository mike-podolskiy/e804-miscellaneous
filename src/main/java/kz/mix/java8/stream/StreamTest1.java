package kz.mix.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    private static List<String> list = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
    
    public static void main(String[] args) {
        // Вернуть количество вхождений объекта «a1»
        System.out.println(list.stream().filter("a1"::equals).count()); // 2

        // Вернуть первый элемент коллекции или 0, если коллекция пуста
        System.out.println(list.stream().findFirst().orElse("0")); // a1

        // Вернуть последний элемент коллекции или «empty», если коллекция пуста
        System.out.println(list.stream().skip(list.size() - 1).findAny().orElse("empty")); // a1

        // Найти элемент в коллекции равный «a3» или кинуть ошибку
        System.out.println(list.stream().filter("a3"::equals).findFirst().get()); // a3

        // Вернуть третий элемент коллекции по порядку
        System.out.println(list.stream().skip(2).findFirst().get()); // a3

        // Вернуть два элемента начиная со второго
        System.out.println(Arrays.toString(list.stream().skip(1).limit(2).toArray())); // [a2, a3]

        // Выбрать все элементы по шаблону
        System.out.println(list.stream().filter(s -> s.contains("1")).collect(Collectors.toList())); // [a1, a1]


    }
}
