//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

public class ClassDesign1 {
    public static void main(String... args) {
        // если ЛОКАЛЬНУЮ переменную не проинициализировать, то возникнет ошибка компиляции:
        // String i;

        String i = null;

        if (i == null) {
            System.out.print("A");
        } else {
            System.out.print("B");
            i = "A";

            main("A", "B");
        }
    }
}
