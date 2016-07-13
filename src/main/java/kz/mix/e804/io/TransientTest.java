//CHECKSTYLE:OFF
package kz.mix.e804.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientTest implements Serializable {
    private String a;
    private transient String b;

    public TransientTest(String aa, String bb) {
        a = aa;
        b = bb;
    }

    public String toString() {
        return a + "\n" + b;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(b);
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        b = ((String) stream.readObject());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransientTest sc = new TransientTest("Test1", "Test2");
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(buf);
        o.writeObject(sc);

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
        TransientTest sc2 = ((TransientTest) in.readObject());
        System.out.println(sc2);
    }


}
