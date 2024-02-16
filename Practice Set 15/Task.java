// Task: Create a library management system which is capable of issuing books to the students.
// Book should have info like:
// 1. Book name
// 2. Book Author
// 3. Issued to
// 4. Issued on
// User should be able to add books, issue books and return issued books.
// Assume that all the users are registered with their names in the central database.

import java.util.*;

class MyBook {
    String name;
    String author;

    public MyBook(String book_name, String author_name) {
        name = book_name;
        author = author_name;
    }

    public String toString() {
        return "Book {" +
                "name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                '}';
    }
}

class MyLibrary {
    public ArrayList<MyBook> books;

    public MyLibrary(ArrayList<MyBook> books) {
        this.books = books;
    }

    public void AddBook(MyBook book) {
        System.out.println("The book has been added in the library successfully!");
        this.books.add(book);
    }

    public void IssueBook(MyBook book, String issuedTo) {
        System.out.println("The book " + book +  "has been issued from the library to " + issuedTo + ".");
        this.books.remove(book);
    }

    public void ReturnBook(MyBook book, String returnedBy) {
        System.out.println("The book has been returned to library successfully by " + returnedBy + ".");
        this.books.add(book);
    }
}

public class Task {
    public static void main(String[] args) {
        ArrayList<MyBook> myBooks = new ArrayList<>();
        // adding books in the library
        MyBook b1 = new MyBook("Pawankhind", "Ranjit Desai");
        myBooks.add(b1);

        MyBook b2 = new MyBook("Yayati", "V. S. Khandekar");
        myBooks.add(b2);

        MyBook b3 = new MyBook("Shivgandh", "Dr. Amol Kolhe");
        myBooks.add(b3);

        MyBook b4 = new MyBook("Partner", "V. P. Kale");
        myBooks.add(b4);

        MyBook b5 = new MyBook("The Alchemist", "Paulo Coelho");
        myBooks.add(b5);

        MyBook b6 = new MyBook("Learn Java", "Pearson");
        myBooks.add(b6);

        MyBook b7 = new MyBook("All About Money", "Sanjay Bose");
        myBooks.add(b7);

        MyLibrary lib = new MyLibrary(myBooks);
        // printing the current books present in the library
        System.out.println(lib.books);

        // Issuing a book from the library
        lib.IssueBook(b3, "Sandesh");
        System.out.println(lib.books); // printing the remaining books present in the library

        System.out.println();

        lib.IssueBook(b5, "Danny");
        System.out.println(lib.books); // printing the remaining books present in the library

        System.out.println();

        lib.IssueBook(b6, "Freddy");
        System.out.println(lib.books); // printing the remaining books present in the library

        System.out.println();

        lib.IssueBook(b1, "Prajwal");
        System.out.println(lib.books); // printing the remaining books present in the library

        System.out.println();

        // Returning a book to the library
        lib.ReturnBook(b5, "Danny");
        System.out.println(lib.books); // printing the remaining books present in the library

    }
}