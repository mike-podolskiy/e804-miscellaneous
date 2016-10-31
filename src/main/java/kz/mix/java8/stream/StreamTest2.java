package kz.mix.java8.stream;

import kz.mix.java8.stream.model.People;
import kz.mix.java8.stream.model.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {
    //J-
    private static List<People> list = new ArrayList<>(Arrays.asList(
            new People("Вася", 16, Sex.MAN),
            new People("Петя", 23, Sex.MAN),
            new People("Елена", 42, Sex.WOMAN),
            new People("Иван Иванович", 69, Sex.MAN)));
    //J+

    public static void main(String[] args) {
        // Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        // Результат: [People(name=Петя, age=23, sex=MAN)]
        System.out.println(list.stream().filter(p -> p.getAge() >= 18 && p.getAge() < 27 && p.getSex() == Sex.MAN).collect(Collectors.toList()));

        // Найти средний возраст среди мужчин
        // Результат: 36.0
        System.out.println(list.stream().filter(p -> p.getSex() == Sex.MAN).mapToInt(People::getAge).average().getAsDouble());

        // Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        // Результат: 2
        System.out.println(list.stream().filter(p -> p.getAge() >= 18)
                .filter(p -> (p.getSex() == Sex.MAN && p.getAge() < 60) || (p.getSex() == Sex.WOMAN && p.getAge() < 55)).count());
    }
}
