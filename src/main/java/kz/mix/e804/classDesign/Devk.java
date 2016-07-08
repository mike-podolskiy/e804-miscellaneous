//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

public class Devk {
    public static void tMeth(Integer... i) {
        System.out.println("A");
    }

    public static void tMeth(int... i) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        // ошибка компиляции - оба метода подходят
        // tMeth(Integer.valueOf("7"));
    }
}
