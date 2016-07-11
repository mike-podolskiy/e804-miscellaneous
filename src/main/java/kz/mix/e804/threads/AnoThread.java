//CHECKSTYLE:OFF
package kz.mix.e804.threads;

public class AnoThread {
    public static void main(String[] args) throws Exception {
        synchronized ("A") {
            Runnable rb = new Runnable() {
                @Override
                public void run() {
                    System.out.print("Sys");
                }
            };

            Thread t = new Thread(rb);
            t.start();

            // неправильный вариант запуска потока - нужно создать объект класса Thread и передать конструктору объект Runnable
            // в данном случае - rb
            // rb.start();

            // вывод в консоль будет MSys
            System.out.print("M");
        }
    }
}
