//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

// результат в java 7 - sri lanka sRI lANKA www.lanka.lk
// результат в более ранних версиях - ошибка компиляции, т.к. String нельзя использовать в качестве параметра
public class Count1 {
    public static void main(String[] args) {
        String s = "sri";

        switch (s) {
            case "SRI" :
                System.out.print("SRI LANKA ");
            case "Sri" :
                System.out.print("Sri Lanka ");
            case "sri" :
                System.out.print("sri lanka ");
            case "sRI" :
                System.out.print("sRI lANKA ");
            default :
                System.out.print("www.lanka.lk");
        }
    }
}
