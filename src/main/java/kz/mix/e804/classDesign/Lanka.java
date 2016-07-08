//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

public class Lanka {
    public Lanka(Object o) {
        System.out.println("Object In");
    }

    public Lanka(Integer o) {
        System.out.println("Integer In");
    }

    public Lanka(Number o) {
        System.out.println("Number In");
    }

    public static void main(String[] args) {
        new Lanka(null);
    }
}
