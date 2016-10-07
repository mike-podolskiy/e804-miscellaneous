//CHECKSTYLE:OFF
package kz.mix.e804.exceptionsAssertions;

// Результат
// Processed in m2 block: Exception from m1
// Processed in main block: Exception from finally
// Suppressed: Exception from close
public class ExceptionTest2 implements AutoCloseable {
    public static void m1() throws Exception {
        throw new Exception("Exception from m1");
    }

    public static void m2() throws Exception {
        try {
            m1();
        } catch (Exception e) {
            // Can't do much about this exception so rethrow it
            System.out.println("Processed in m2 block: " + e.getMessage());
            throw e;
        } finally {
            throw new RuntimeException("Exception from finally");
        }
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Exception from close");
    }

    public static void main(String[] args) {
        try (ExceptionTest2 test = new ExceptionTest2()) {
            m2();
        } catch (Exception e) {
            System.out.println("Processed in main block: " + e.getMessage());

            Throwable[] ta = e.getSuppressed();
            for (Throwable t : ta) {
                System.out.println("Suppressed: " + t.getMessage());
            }
        }
    }
}
