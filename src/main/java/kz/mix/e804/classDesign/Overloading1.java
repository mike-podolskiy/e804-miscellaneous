//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

import org.junit.runners.model.TestClass;

public class Overloading1 {
    void probe(int... x) {
        System.out.println("in ...");
    }

    void probe(Integer x) {
    System.out.println("In Integer");
    }

    void probe(long x) {
    System.out.println("In long");
    }

    void probe(Long x) {
        System.out.println("In LONG");
    }

    public static void main(String[] args) {
        Integer a = 4;
        new Overloading1().probe(a); // Результат: In Integer

        int b = 4;
        new Overloading1().probe(b); // Результат: In long

    }
}
