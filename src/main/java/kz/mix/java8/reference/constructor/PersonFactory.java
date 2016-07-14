//CHECKSTYLE:OFF
package kz.mix.java8.reference.constructor;

@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String firstName, String LastName);
}
