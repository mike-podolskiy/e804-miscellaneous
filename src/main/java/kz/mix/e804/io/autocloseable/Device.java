//CHECKSTYLE:OFF
package kz.mix.e804.io.autocloseable;

import java.io.IOException;

// Пример AutoCloseable
// результат: Device Opened Device closed Got Exception
// ресурс закрывается перед вызовом try-catch блока!
public class Device implements AutoCloseable {
    String header = null;

    public void open() {
        header = "OPENED";
        System.out.println("Device Opened");
    }


    public void read() throws IOException {
        throw new IOException("Unknown");
    }

    public void writeHeader(String str) throws IOException {
        System.out.println("Writing : " + str);
        header = str;
    }

    @Override
    public void close() {
        header = null;
        System.out.println("Device closed");
    }

    public static void main(String[] args) {
        try(Device d = new Device();) {
            d.open();
            d.read();
        } catch (IOException e) {
            System.out.println("Got Exception");
        }
    }

}
