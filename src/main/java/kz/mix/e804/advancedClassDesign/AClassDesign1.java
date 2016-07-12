//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

class Parent {
}

class Child extends Parent {
}

// Результат - Parent Child Parent
// Переопределение - метод выбирается на этапе компиляции
public class AClassDesign1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent p2 = new Child();

        useIt(p);
        useIt(c);
        useIt(p2);
    }

    // Допустимо использовать final + static, несмотря на то, что static метод не переопределяются
    // метод с такой же сигнатурой нельзя будет определить в потомках
    // если final убрать, то в потомках можно будет определить метод с такой же сигнатурой и он будет "сокрывать" родительский
    final static void useIt(Parent p) {
        System.out.println("Parent");
    }

    final static void useIt(Child c) {
        System.out.println("Child");
    }
}
