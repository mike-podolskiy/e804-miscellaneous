//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

public class STClass {
    static int i = 0;

    public static int getRef() {
        return i++;
    }

    public static class Tash {
        static int p = 0;

        public static int getRef() {
            return i + p++;
        }
    }

    public static void main(String[] args) {
        // неправильное обращение к статическим методам - нужно по ссылке, а не по объекту
        int a1 = new STClass().getRef();
        int a2 = new STClass().getRef();
        int a3 = new STClass.Tash().getRef();
        int a4 = new STClass.Tash().getRef();

        // такая конфигурация вызовет ошибку компиляции
        // int a4 = new STClass().new Tash().getRef();
        // правильно вызывать метод getRef вот так:
        // STClass.Tash.getRef();
        // можно и так (будет работать), но неправильно:
        // new STClass.Tash().getRef();

        System.out.print(a1 + ":" + a2 + ":" + a3 + ":" + a4);
    }
}
