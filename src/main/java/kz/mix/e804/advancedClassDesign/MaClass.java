//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

// результат SCJP, Mobile Application Developer, null
// s2 еще не проинициализирована в тот момент когда ее возвращает, отсюда и null
public class MaClass {
    {
        System.out.print("SCEA, ");
    }

    static {
        System.out.print("SCJP, ");
    }

    static String s1 = getVal();
    static String s2 = "Web Component Developer, ";

    private static String getVal() {
        System.out.print("Mobile Application Developer, ");
        return s2;
    }

    public static void main(String[] args) {
        System.out.print(s1);
    }

}
