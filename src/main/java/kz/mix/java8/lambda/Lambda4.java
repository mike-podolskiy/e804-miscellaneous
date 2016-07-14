//CHECKSTYLE:OFF
package kz.mix.java8.lambda;

import kz.mix.java8.defaultMethod.Formula;

// Такая запись в поля класса работает без проблем (в отличии от записи в локальную переменную)
public class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };


        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };

    }
}
