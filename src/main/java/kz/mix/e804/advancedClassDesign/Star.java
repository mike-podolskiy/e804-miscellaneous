//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

public class Star {
    static int a = 0;
    volatile int b = 1;

    public static void main(String[] args) {
        new Star().a = 2;
        new Star().b = 3;
        new Star().a = 4;
        new Star().b = 5;

        System.out.println(new Star().a + new Star().b);
    }
}
