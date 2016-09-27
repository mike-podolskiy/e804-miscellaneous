//CHECKSTYLE:OFF
package kz.mix.e804.io.serialize1;

import java.io.Serializable;

// 1) Если суперкласс не реализует интерфейс Serializable, 
// то сабкласс вызывает конструктор\блоки инициализации суперкласса при сериализации,
// а если реализует - то нет
// 2) Статичкские блоки вызваются в любом случае
public class Boo implements Serializable {
    {
        System.out.println("Boo");
    }

    static {
        System.out.println("static Boo");
    }

    public Boo() {
        System.out.println("In Boo");
    }
}
