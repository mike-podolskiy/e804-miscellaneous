//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

public class A {
    static class B extends A {
        public void capture() {
            System.out.println("Cap:a.b");
        }
    }

    static class C extends B {
        public void capture() {
            System.out.println("Cap:a.c");
        }
    }

    public void capture() {
        System.out.println("Cap:a");
    }

    public static void main(String[] args) {
        A ob = new C();
        ob.capture();
    }
}
