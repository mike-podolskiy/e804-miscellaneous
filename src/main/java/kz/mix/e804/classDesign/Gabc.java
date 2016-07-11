//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// результат нельзя предсказать - неизвестно когда начнется сборка мусора
public class Gabc {
    static int i = 0;
    Gabc g = null;

    public void finalize() {
        i++;
    }

    public static void main(String[] args) {
        Gabc gab1 = new Gabc();
        Gabc gab2 = new Gabc();
        Gabc gab3 = new Gabc();
        gab3.g = gab1;
        gab1.g = gab2;
        gab2.g = gab2;
        gab1 = null;
        gab3 = null;

        Runtime.getRuntime().gc();
        System.out.print(i + " objects removed");
    }
}
