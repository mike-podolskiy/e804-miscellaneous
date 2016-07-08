//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

// результат PrseomcTest
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prometric");

        // можно добавлять StringBuilder т.к. он реализует CharSequence
        sb.append(new StringBuilder("Test"));
        sb.delete(4, 8).insert(2, "se");

        System.out.println(sb);
    }
}
