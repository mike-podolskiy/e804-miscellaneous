//CHECKSTYLE:OFF
package kz.mix.e804.io;

import java.io.RandomAccessFile;

// Записывает в начало, заменя существующие символы данными, все остальное остается нетронутым
// Можно установить курсор с помощью метода seek
// Дотупные ключи - r(чтение) rw(чтение+запись)
// rwd "rw", and also require that every update to the file's content be written synchronously to the underlying storage device.
// rws "rw", and also require that every update to the file's content or metadata be written synchronously to the underlying storage device.
public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Podolskiy.Mikhail\\Desktop\\EXAM\\test\\test.txt", "rwd");

        raf.seek(17);
        raf.writeUTF("hello");
        raf.close();
    }
}
