//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize1;

import java.io.Serializable;

public class BooBoo extends Boo implements Serializable {
    public BooBoo() {
        System.out.println("In BooBoo");
    }
}
