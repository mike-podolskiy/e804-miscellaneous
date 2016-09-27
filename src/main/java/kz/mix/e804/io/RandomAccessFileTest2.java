//CHECKSTYLE:OFF
package kz.mix.e804.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class RandomAccessFileTest2 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\test.txt", "rwd");

        // Запишет в дефолтной кодировке - в итоге возникнет исключение EOFException
        // raf.writeChars("hello world");

        raf.seek(2);
        raf.writeUTF("hello world");
        raf.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\test.txt"));
        String value = dis.readUTF();
        System.out.println(value);
        dis.close();
    }
}
