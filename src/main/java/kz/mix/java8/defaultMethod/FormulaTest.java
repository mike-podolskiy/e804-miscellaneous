//CHECKSTYLE:OFF
package kz.mix.java8.defaultMethod;

import kz.mix.java8.defaultMethod.Formula;

public class FormulaTest {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(1));
        System.out.println(formula.sqrt(100));
    }
}
