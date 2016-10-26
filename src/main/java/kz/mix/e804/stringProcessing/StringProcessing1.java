package kz.mix.e804.stringProcessing;

import java.util.Locale;

public class StringProcessing1 {
    public static void main(String[] args) {
        boolean b = true;
        int i1 = 100;
        int i2 = -200;
        double d = -23.20;
        char ch = 'm';
        String str = "hello";

        Locale.setDefault(Locale.US);

        System.out.printf("\"%-+5d4\"", i1); // "+100 4"
        System.out.println();

        System.out.printf("\"%(d+10\"", i2); // "(200)+10"
        System.out.println();

        System.out.printf("\"$%.2f\"", d); // "$-23.20"
        System.out.println();

        System.out.printf("\"%s world\"", str); // "hello world"
        System.out.println();

        System.out.printf("\"%2$c + %1$d\"", i1, ch); // "m + 100"
        System.out.println();

        System.out.printf("%b", "false"); // true

    }
}
