//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize2;

import java.io.Serializable;

public class Boo implements Serializable {
    transient int ti = 10;
    static int si = 20;
}
