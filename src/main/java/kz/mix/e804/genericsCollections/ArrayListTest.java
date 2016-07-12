//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections;

import java.util.ArrayList;

// Результат [8, 5, 8, 5, 7]
public class ArrayListTest {
    static ArrayList<Integer> v = new ArrayList<>();

    // Этот блок сработает последним и добавит в v значение 7
    {
        v.add(7);
    }

    // Этот блок сработает первым
    static {
        v.add(5);
    }

    // Этот блок сработает вторым.
    // Создается новый объект (анонимный клас) унаследованный от ArrayList
    // далее в него записывается значение 8, значения из List'а (там только 5) и
    // добавляет все значения из себя же самого с помощью this (8 и 5)
    // Итого: 8 5 8 5 - эти значения запишутся в v
    static {
        v = new ArrayList() {
            {
                add(8);
                addAll(v);
                addAll(this);
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(new ArrayListTest().v);
    }
}
