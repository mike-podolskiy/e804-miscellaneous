//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

// результат - XMethod123
class XMethod {
    static {
        System.out.print("XMethod");
    }

    public static XMethod getMe() {
        System.out.print(1);
        return new XMethod();
    }

    public int doThis() {
        System.out.print(2);
        return 3;
    }
}

public class XMDemo {
    public static void main(String[] args) {
        System.out.print(XMethod.getMe().doThis());
    }
}
