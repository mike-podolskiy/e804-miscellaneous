//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// результат - AGAADGBDAF
public class Fex2 {
    public static void main(String[] args) {
        byte b1 = 12;
        Byte B1 = new Byte(b1);
        short s1 = 6;
        Short S1 = new Short(s1);
        int i1 = 7;
        Integer I1 = new Integer(i1);
        Long l1 = new Long(45L);
        Number nm = new Short("4");

        capture(b1);
        capture(B1);
        capture(s1);
        capture(s1 += 20000);
        capture(S1);
        capture(nm);
        capture(l1.intValue());
        capture(Short.valueOf("110110", 2));
        capture(Short.parseShort("110110", 2));
        capture();
    }

    static void capture(short x) {
        System.out.print("A");
    }

    static void capture(int x) {
        System.out.print("B");
    }

    static void capture(long x) {
        System.out.print("C");
    }

    static void capture(Short x) {
        System.out.print("D");
    }

    static void capture(Integer x) {
        System.out.print("E");
    }

    static void capture(Long... x) {
        System.out.print("F");
    }

    static void capture(Number x) {
        System.out.print("G");
    }

}
