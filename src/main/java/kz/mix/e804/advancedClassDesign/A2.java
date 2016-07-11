//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

// результат High High
// полиморфизм не срабатывает - т.к. метод runNow в базовом классе имеет модификатор доступа private
public class A2 {
    private String runNow() {
        return "High";
    }

    static class B2 extends A2 {
        // "сокрытие" родительского метода
        public String runNow() {
            return "Low";
        }
    }

    public static void main(String[] args) {
        A2[] a = new B2[] { new B2(), new C2() };

        for (A2 aa : a) {
            System.out.print(aa.runNow() + " ");
        }
    }
}

class C2 extends A2.B2 {
    // корректно переопределяет метод класса A2.B2
    public String runNow() {
        return "Out";
    }
}
