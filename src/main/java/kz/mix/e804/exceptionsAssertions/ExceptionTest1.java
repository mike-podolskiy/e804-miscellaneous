//CHECKSTYLE:OFF
package kz.mix.e804.exceptionsAssertions;

// результат - ошибка компиляции
public class ExceptionTest1 {
    public static void main(String[] args) {
        int i = 4;

        try {
            i = i / 0;

            // InterruptedException не выбрасывается в этом блоке и т.к. это проверяемое исключение, то такой блок недопустим
            // catch (InterruptedException e) {
            // System.out.print("ie ");
            // }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("aioob ");
        } catch (RuntimeException e) {
            System.out.print("re ");
        } catch (Exception e) {
            System.out.print("e ");
        }
    }

}
