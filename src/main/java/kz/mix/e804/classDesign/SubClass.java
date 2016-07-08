//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// результат: super context
// можно убрать "throws ArithmeticException"
class SuperClass {
    static void printMe() {
        System.out.print("super context ");
    }
}

public class SubClass extends SuperClass {
    public static void printMe() throws ArithmeticException {
        System.out.print("sub context");
    }

    public static void main(String[] args) {
        SuperClass sc = new SubClass();
        sc.printMe();
    }
}
