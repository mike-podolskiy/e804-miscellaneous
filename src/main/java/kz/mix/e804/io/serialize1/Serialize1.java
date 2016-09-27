//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize1 {
    public static void main(String[] args) throws Exception {
        Moo moo = new Moo();

        moo.moo1 = 50;
        moo.moo2 = 50;
        moo.moo3 = 50;
        moo.moo4 = 50;

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\moo1.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(moo);
        os.close();
    }
}
