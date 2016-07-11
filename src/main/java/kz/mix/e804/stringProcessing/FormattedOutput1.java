//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

// Результат 1213%1$s
// Первый аргумент - выводимое сообщение, последующие - аргументы вывода.
// Лишние аргументы вывода игнорируются
public class FormattedOutput1 {
    public static void main(String[] args) {
        System.out.printf("12%1$s", "13%1$s", "14%1$s");
    }
}
