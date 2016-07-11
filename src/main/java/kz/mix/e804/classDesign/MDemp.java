//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

import java.io.File;
import java.util.Date;

// результат - будет выведено в консоль B C D E
public class MDemp {
    public static void main(String[] args) {
        // Today 07/07/2016
        Date dt1 = new Date();
        // 1 января 1970 + время заданное в конструкторе в милисекундах
        Date dt2 = new Date(1000);

        // false
        boolean b1 = dt1.before(dt2);
        // false
        // false или true - не имеет значения, т.к. используется конструкция b3 = true
        boolean b3 = new File("script1.js").isFile();
        boolean b4 = false;

        int x = 0;

        do {
            x++;

            switch (x) {
                case 0:
                    System.out.print("A ");
                    break;
                case 1:
                    System.out.print("B ");
                    break;
                case 2:
                    System.out.print("C ");
                    break;
                case 3:
                    System.out.print("D ");
                    if (b1) {
                        b4 = true;
                    }
                    break;
                case 4:
                    System.out.print("E ");
                    if (!b1) {
                        b4 = true;
                    }
                    break;
            }

            if (b4) {
                break;
            }
        } while (b3 = true);

    }
}
