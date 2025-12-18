package main.java.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.addBook(new Book(1, "Война и мир",
                "Л.Н. Толстой", 1869, "978-5-17-090335-2"));
        
        library.addBook(new Book(2, "Преступление и наказание",
                "Ф.М. Достоевский", 1866, "978-5-17-090336-9"));
        
        library.addBook(new Book(3, "Анна Каренина",
                "Л.Н. Толстой", 1877, "978-5-17-090337-6"));
        
        Book book = library.findBookById(2);
        if (book != null) {
            System.out.println("Найдена книга: " + book.getTitle());
        }
        
        library.borrowBook(1);
        
        library.returnBook(1);
        
        System.out.println("Доступные книги:");
        for (Book b : library.getAvailableBooks()) {
            System.out.println(b);
        }
        
        library.printOperationLog();
    }
}