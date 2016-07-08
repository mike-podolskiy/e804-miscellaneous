//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// результат C A D B E
public class AnotherExam {
    static boolean b;

    public static void main(String[] args) {
        if (b) {
            System.out.print("A");
            System.out.print(args[0]);
            System.out.print("B");
        } else {
            System.out.print("C");
            b = true;
            main(new String[]{"D"});
            System.out.print("E");
        }
    }
}
