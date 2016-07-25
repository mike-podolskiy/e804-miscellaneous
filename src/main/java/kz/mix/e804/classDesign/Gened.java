//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

public class Gened {
    public static void main(String[] args) {
        doNumber(2);
        doNumber(2L);
        doNumber(new int[] {1,2,3});
        doNumber(new Integer(2));
        doNumber(new Integer[2]);
    }

    public static void doNumber(int i) {
        System.out.print("a");
    }
    public static void doNumber(int... dn) {
        System.out.print("b");
    }
    public static void doNumber(Integer dn) {
        System.out.print("c");
    }
    public static void doNumber(Integer... dn) {
        System.out.print("d");
    }
    public static void doNumber(Object dn) {
        System.out.print("e");
    }
}
