package kz.mix.e804.classDesign.tough;

import java.util.HashMap;
import java.util.Map;

// Скомпилируется без ошибок
// Напечатает 10
// Ошибка времени выполнения - NullPointerException
// Проблема в том, что не переопределен hashCode - каждый раз будет возвращаться новое значение
class Some {
    private int s;
}

class Book {
    private String title;
    private String isbn;
    private Some some;

    public boolean equals(Object o) {
        // доступ к полю isbn другого объекта Book возможен
        return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

class BookStore {
    Map<Book, Integer> map = new HashMap<Book, Integer>();

    int getNumberOfCopies(Book b) {
        return map.get(b);
    }

    public void addBook(Book b, int numberofcopies) {
        map.put(b, numberofcopies);
    }
}

public class ToughClassDesign1 {
    static BookStore bs = new BookStore();

    public static void main(String[] args) throws Exception {
        Book b = new Book();
        b.setIsbn("111");

        // все ок - объект есть в мапе
        // будет напечатано 10
        bs.addBook(b, 10);
        System.out.println(bs.getNumberOfCopies(b));

        // создается новый объект с новым хэш-кодом
        b = new Book();
        b.setIsbn("111");

        // объект с новым хэш-кодом не будет найден, так как у нас в мапе хранится объект со старым хэш-кодом
        // результат - метод get мапы вернет null и попытается его развернуть в int (unboxing) -> NullPointerException
        System.out.println(bs.getNumberOfCopies(b));
    }
}
