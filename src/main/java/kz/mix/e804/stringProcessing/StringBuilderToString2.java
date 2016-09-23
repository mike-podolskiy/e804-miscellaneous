//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

public class StringBuilderToString2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("8");
        int i = 8;

        // Мы можем складывмть StringBuilder\StringBuffer со строками
        System.out.println("" + sb);

        // И только со строками! Такое сложение вызовет ошибку компиляции!
        // System.out.println(8 + sb);

        // Тут уже идет сложение StringBuilder'а со строкой
        // Сначала целочисленно складывается 8 и 8 - получается 16
        // Потом уже как строки складываются 16 и 8 - получается 168
        System.out.println(8 + i + "" + sb);
    }
}
