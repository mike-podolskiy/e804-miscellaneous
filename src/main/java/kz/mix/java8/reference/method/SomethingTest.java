//CHECKSTYLE:OFF
package kz.mix.java8.reference.method;

import kz.mix.java8.lambda.Converter;

public class SomethingTest {
    public static void main(String[] args) {
        Something some = new Something();
        Converter<String, String> converter = some::startsWith;

        String converted = converter.convert("Java");
        System.out.println(converted);
    }
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
