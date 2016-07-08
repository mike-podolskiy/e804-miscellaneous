//CHECKSTYLE:OFF
package kz.mix.e804.localization;

// "appropriate" assertions
// где можно прочитать про "подходящее" использование assert
// Oracle doc:
// 1) Do not use assertions for argument checking in public methods
// 2) Do not use assertions to do any work that your application requires for correct operation.
// As a rule, the expressions contained in assertions should be free of side effects
public class ApAssert {
    public static void main(String[] args) {
        assert args.length == 0;
        evaluate("", false);
    }

    private static void evaluate(String s, boolean flag) {
        // int i = Integer.parseInt(s.trim());
        int i = 0;

        // assert;
        assert flag = false : getText();

        System.out.println("Received Status: " + flag);

        i--;
        assert i-- <= 0;
    }

    private static String getText() {
        return "some text";
    }
}
