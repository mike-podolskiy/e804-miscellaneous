//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Boo boo = new Boo();

        // si - статическое поле и оно не будет сериализовано
        boo.si++;

        // 10 21
        System.out.println(boo.ti + " " + boo.si);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\moo1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(boo);
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\moo1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boo = (Boo) ois.readObject();
        fis.close();

        // 0 21
        // Однако не смотря на то, что si не было сериализовано, значение 21
        // так как изменения и десереализация в одном и том же участке кода
        System.out.println(boo.ti + " " + boo.si);
    }
}
