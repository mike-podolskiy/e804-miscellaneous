//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

public class StringBuilderToString1 {
    public static void main(String[] args) {
        // Все ОК - создается StringBuilder и его значение "8"
        // Результат вывода - 88
        StringBuilder sb = new StringBuilder("8");
        System.out.println(8 + sb.toString());

        // Используется конструктор StringBuilder(int capacity), а само значение пустое
        // Результат вывода - 8
        StringBuilder sb1 = new StringBuilder(8);
        System.out.println(8 + sb1.toString());
    }
}
