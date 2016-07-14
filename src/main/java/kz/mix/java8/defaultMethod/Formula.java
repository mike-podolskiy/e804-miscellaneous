//CHECKSTYLE:OFF
package kz.mix.java8.defaultMethod;

public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
