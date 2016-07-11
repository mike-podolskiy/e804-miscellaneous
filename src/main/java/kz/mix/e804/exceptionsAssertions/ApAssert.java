//CHECKSTYLE:OFF
package kz.mix.e804.exceptionsAssertions;

// "appropriate" assertions
// "подходящее" использование assert
// Oracle doc:
// 1) Do not use assertions for argument checking in public methods
// 2) Do not use assertions to do any work that your application requires for correct operation.
// As a rule, the expressions contained in assertions should be free of side effects
public class ApAssert {
    public static void main(String[] args) {
        // неподходящее использование - assert не используется для проверки аргументов public методов
        assert args.length == 0;
        evaluate("", false);
    }

    private static void evaluate(String s, boolean flag) {
        // int i = Integer.parseInt(s.trim());
        int i = 0;

        // assert;
        // неподходящее использование - сначала присвоить, потом проверять flag
        assert flag = false : getText();

        System.out.println("Received Status: " + flag);

        i--;
        // неподходящее использование - сначала декремент, потом сравнение с нулем
        assert i-- <= 0;
    }

    private static String getText() {
        return "some text";
    }
}
