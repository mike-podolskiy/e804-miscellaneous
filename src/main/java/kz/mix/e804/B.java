//CHECKSTYLE:OFF
package kz.mix.e804;

class A {
    public static class GreenHouse {
        int x = 1;
    }

    public GreenHouse gh;

    public A(GreenHouse gh) {
        this.gh = gh;
    }

    public GreenHouse getGreenHouse() {
        return gh;
    }
}

public class B {
    public static class GreenHouse {
        int x = 2;
    }

    public static void main(String[] args) {
//        так будет ошибка
//        A a = new A(new GreenHouse());

        A a = new A(new A.GreenHouse());
        System.out.println(a.getGreenHouse().x);
    }
}
