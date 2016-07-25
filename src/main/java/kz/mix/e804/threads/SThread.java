//CHECKSTYLE:OFF
package kz.mix.e804.threads;

public class SThread implements Runnable {
    public void run() {
        try {
            System.out.print("a");
            // Так метод вызвать не получится
            // sleep(1000)
            Thread.sleep(1000);
            System.out.print("b");
        } catch (InterruptedException ie) {
            System.out.print("Thread Interrupted");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new SThread());
        t.start();
        t.interrupt();
    }
}
