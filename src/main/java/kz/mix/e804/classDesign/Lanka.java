//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// Все классы находятся в одной иерархии, следовательно вызовется самый "конкретный", т.е. Integer (Object -> Number -> Integer)
// Если добавить конструктор с параметром не из данной иерархии классов, например String, то возникнет ошибка компиляции -
// неоднозначная ссылка на конструктор
public class Lanka {
    public Lanka(Object o) {
        System.out.println("Object In");
    }

    public Lanka(Integer o) {
        System.out.println("Integer In");
    }

    public Lanka(Number o) {
        System.out.println("Number In");
    }

    public static void main(String[] args) {
        new Lanka(null);
    }
}
