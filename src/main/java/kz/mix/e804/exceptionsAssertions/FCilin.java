//CHECKSTYLE:OFF
package kz.mix.e804.exceptionsAssertions;

// результат - 3 (NullPointerException)
public class FCilin {
    public static void main(String[] args) {
        try {
            getMe();
        } catch (ArithmeticException ae) {
            System.out.print(1);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print(2);
        } catch (NullPointerException npe) {
            System.out.print(3);
        } catch (RuntimeException re) {
            System.out.print(4);
        } catch (Exception e) {
            System.out.print(5);
        }
    }

    private static void getMe() throws ArithmeticException {
        if (true)
            throw new NullPointerException();
        throw new ArrayIndexOutOfBoundsException();
    }

}
