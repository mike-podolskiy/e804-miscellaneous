//CHECKSTYLE:OFF
package kz.mix.java8.lambda;

public class LambdaTestAccess {
    public static void main(String[] args) {
        // Использование final переменной внутри lambda
        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

        System.out.println(stringConverter.convert(2));

        // Переменная может быть объявлена как обычная, не final
        int num1 = 1;
        Converter<Integer, String> stringConverter1 = (from) -> String.valueOf(from + num1);

        System.out.println(stringConverter1.convert(1));

        // но попытка ее изменить вызовет ошибку компиляции
        // переменная так называемая "effectively final"
        // num1 = 1;

    }
}
