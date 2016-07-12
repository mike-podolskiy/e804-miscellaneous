////CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

import java.util.Arrays;

// Результат выполнения - ошибка во время выполнения ExceptionInInitializerError
public class ClassDesign2 {
    static int[] x = new int[4];

    public static void main(String[] args) {
        ClassDesign2 test = new ClassDesign2();

        System.out.println(Arrays.toString(x));
    }

    static {
        x[4] = 5;
    }
}
