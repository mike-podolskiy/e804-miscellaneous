//CHECKSTYLE:OFF
package kz.mix.java8;

public class ConverterImpl {
    public static void main(String[] args) {
        Converter<String, Integer> converter7 = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };

        Converter<String, Integer> converter8 = (from) -> Integer.valueOf(from);

        System.out.println(converter8.convert("123"));
        System.out.println(converter7.convert("12"));
    }
}
