//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize1;

import java.io.Serializable;

public class Moo extends BooBoo implements Serializable {
    // статическиое поле - после сериализации\десериализации значение будет таким же,
    // не смотря на изменения в коде
    static int moo1 = 10;

    // обычное поле - значение будет зависить от изменений в коде
    int moo2 = 20;

    // так же как и просто статическое поле
    transient static int moo3 = 30;

    // transient поле - значение будет утеряно после десериализации - будет присвоено значение по умолчанию
    transient int moo4 = 40;

    {
        System.out.println("moo set to 10");
    }

    public Moo() {
        System.out.println("In Moo");
    }
}
