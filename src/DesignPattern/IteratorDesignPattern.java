package DesignPattern;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

interface BookIterator {
    boolean hasNext();
    Book next();
}

interface BookCollection {
    void addBook(Book book);
    BookIterator iterator();
}

class Library implements BookCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public BookIterator iterator() {
        return new LibraryIterator();
    }

    // Inner class: concrete iterator
    private class LibraryIterator implements BookIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < books.size();
        }

        public Book next() {
            return books.get(index++);
        }
    }
}



public class IteratorDesignPattern {
	
	public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Effective Java"));
        library.addBook(new Book("Clean Code"));
        library.addBook(new Book("Design Patterns"));

        BookIterator iterator = library.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }

}
