//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// результат - false
// метод equals перегружен, а не переопределен, т.к. изменен тип параметра - должно быть Object, а стоит Profile
// Кроме того, для корректного переопределения equals нужно заменить тип возвращаемого значения с Boolean на boolean и
// модификатор доступа с private на public. И, наконец, корректно реализовать сам метод
class Profile {
    private int a;

    public Profile(int a) {
        this.a = a;
    }

    private Boolean equals(Profile p) {
        return p.a == this.a;
    }
}

public class Usage {
    public static void main(String[] args) {
        Profile pf1 = new Profile(4);
        Profile pf2 = new Profile(4);

        // тут вообще используется метод equals класса Object с дефолтной реализацией (сравнивает ссылки, т.е. работает как ==)
        // т.к. метод equals в классе Profile объявлен с модификтором доступа private
        Object ob = pf1.equals(pf2);

        System.out.println(ob);
    }
}
