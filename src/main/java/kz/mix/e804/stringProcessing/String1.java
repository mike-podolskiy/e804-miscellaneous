//CHECKSTYLE:OFF
package kz.mix.e804.stringProcessing;

public class String1 {
    public static void main(String[] args) {
        String str = new String("");
        StringBuffer sbf = new StringBuffer();
        StringBuilder sbl = new StringBuilder();

        str.concat("");
        // Методы отсутствуют:
//        sbf.concat
//        sbl.concat

        str.equalsIgnoreCase("");
        // Методы отсутствуют:
//        sbf.equalsIgnoreCase
//        sbl.equalsIgnoreCase

        str.charAt(0);
        sbf.charAt(0);
        sbl.charAt(0);

//        str.insert
        sbf.insert(0, "");
        sbl.insert(0, "");

//        str.delete
        sbf.delete(1, 2);
        sbl.delete(1, 2);

        str.toUpperCase();
//        sbf.toUpperCase
//        sbl.toUpperCase

//        str.append
        sbf.append("");
        sbl.append("");

        str.substring(1);
        sbf.substring(1);
        sbl.substring(1);
    }
}
