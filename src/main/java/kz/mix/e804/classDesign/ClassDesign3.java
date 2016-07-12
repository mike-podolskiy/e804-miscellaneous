//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

import java.util.ArrayList;
import java.util.List;

// Результат - [Object, (this Collection)]
public class ClassDesign3 {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("Object");
        list.add(list);
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
