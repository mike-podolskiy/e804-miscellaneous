//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

public class String2 {
    public static void main(String[] args) {
        String s = "A";
        StringBuilder sb = new StringBuilder("B");
        Object ob = s + sb;
        System.out.println((String) (ob));
    }

}
