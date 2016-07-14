//CHECKSTYLE:OFF
package kz.mix.java8.lambda;

import kz.mix.java8.lambda.Converter;

public class ConverterTest {
    public static void main(String[] args) {
        Converter<String, Integer> converter7 = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };

        // Упрощенный вариант с лябдой
        Converter<String, Integer> converter8 = (from) -> Integer.valueOf(from);

        // Вариант с ссылкой на метод при помощи ::
        Converter<String, Integer> converter8ref = Integer::valueOf;

        System.out.println(converter8.convert("123"));
        System.out.println(converter7.convert("12"));
        System.out.println(converter8ref.convert("1"));
    }
}
