//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// результат - IllegalStateException т.к. неправильно вызван метод group
// должен вызываться только если find вернул true. Вот так все будет в порядке:
// while (mt.find()) { System.out.print(mt.group()); }
public class Count2 {
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("Sun Certified Java Programmer");
        Matcher mt = pt.matcher("Certified");

        mt.find();
        System.out.print(mt.group());
    }
}
