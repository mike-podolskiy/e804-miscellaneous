//CHECKSTYLE:OFF
package kz.mix.e804;

class XMethod {
    static {
        System.out.println("XMethod");
    }

    public static XMethod getMe() {
        System.out.println(1);
        return new XMethod();
    }

    public int doThis() {
        System.out.println(2);
        return 3;
    }
}

public class XMDemo {
    public static void main(String[] args) {
        System.out.println(XMethod.getMe().doThis());
    }
}
