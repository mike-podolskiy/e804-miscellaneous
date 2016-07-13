//CHECKSTYLE:OFF
package kz.mix.java8;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
