//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

interface I3 {}
class A3 {}
class B3 implements I3 {}
class C3 extends A3 {}
class D3 {}
final class E3 {}

public class InstOf {
    public static void main(String[] args) {
        Boolean b;

        b = new A3() instanceof I3;
        b = new B3() instanceof I3;
        b = new C3() instanceof I3;
        b = new D3() instanceof I3;

        // E3 - final класс - следовательно его нельзя использовать как левый операнд для instanceof
//        b = new E3() instanceof I3;

        b = new A3[4] instanceof I3[];
        b = new D3[4] instanceof I3[];
        b = new I3[4] instanceof Object;
        b = new A3[] {new A3(), new C3()} instanceof I3[];
    }
}
