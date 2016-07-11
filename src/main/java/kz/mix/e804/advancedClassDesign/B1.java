//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

class A1 {
    public static class GreenHouse {
        int x = 1;
    }

    public GreenHouse gh;

    public A1(GreenHouse gh) {
        this.gh = gh;
    }

    public GreenHouse getGreenHouse() {
        return gh;
    }
}

public class B1 {
    public static class GreenHouse {
        int x = 2;
    }

    public static void main(String[] args) {
        // так будет ошибка компиляции
        // данный констуктор имеет следующий вид A1(A1.GreenHouse), а не A1(B1.GreenHouse)
        // A1 a = new A1(new GreenHouse());

        A1 a = new A1(new A1.GreenHouse());
        System.out.println(a.getGreenHouse().x);
    }
}
