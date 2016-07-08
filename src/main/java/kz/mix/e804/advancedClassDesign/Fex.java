//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign;

import static java.lang.Long.*;
import java.lang.Integer.*;

public class Fex {
    public static void main(String[] args) {
        getIt(MAX_VALUE);
    }

    static void getIt(Number... hg) {
        // Вариант B: не подходит, несовместимость типов
//    static void getIt(Number[] hg) {
    // Вариант C: подходит
//        static void getIt(Number hg) {
// Вариант D: не подходит, несовместимость типов
//    static void getIt(Object[] hg) {
    // Вариант E: подходит
//        static void getIt(Object hg) {

        System.out.println(hg instanceof Object);
    }
}
