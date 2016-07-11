//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

class Some {
    @Override
    public String toString() {
        return "some";
    }
}

public class String2 {
    public static void main(String[] args) {
        String s = "Awe";
        StringBuilder sb = new StringBuilder("B");

        // Такое сложение допустимо, когда один из параметров строка String
        Object ob = s + new Some();
        Object ob1 = s + sb;

        // Такое сложение уже не позволяет сделать компилятор
        // Object ob2 = sb + new Some();

        // а вот так уже можно складывать
        Object ob3 = "Java is " + sb + new Some();
        Object ob4 = sb + " ??? " + new Some();

        // а так опять нельзя :)
        // Object ob4 = sb + new Some() + " again";

        System.out.println((String) (ob));
        System.out.println(ob1);
        System.out.println(ob3);
        System.out.println(ob4);
    }

}
