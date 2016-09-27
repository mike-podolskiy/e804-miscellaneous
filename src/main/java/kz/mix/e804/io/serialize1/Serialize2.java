//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialize2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\moo1.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Moo moo1 = (Moo) is.readObject();
        is.close();

        // Изначально поля имеют значения 10, 20, 30, 40 соответственно
        // Все значения в Serialize1 установлены на 50
        System.out.println(moo1.moo1); // 10
        System.out.println(moo1.moo2); // 50
        System.out.println(moo1.moo3); // 30
        System.out.println(moo1.moo4); // 0
    }
}
