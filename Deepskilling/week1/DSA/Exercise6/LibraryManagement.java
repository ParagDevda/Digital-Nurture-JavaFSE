package Deepskilling.week1.DSA.Exercise6;

class Book {

    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagement {

    // Linear Search
    static int linearSearch(Book books[], String key) {

        for (int i = 0; i < books.length; i++) {

            if (books[i].title.equalsIgnoreCase(key))
                return i;
        }

        return -1;
    }

    // Binary Search
    static int binarySearch(Book books[], String key) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(key);

            if (result == 0)
                return mid;

            else if (result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Book books[] = {
                new Book(101, "C", "Dennis"),
                new Book(102, "Java", "James Gosling"),
                new Book(103, "Python", "Guido")
        };

        String key = "Java";

        int index1 = linearSearch(books, key);

        if (index1 != -1)
            System.out.println("Linear Search: Found at index " + index1);
        else
            System.out.println("Book not found");

        int index2 = binarySearch(books, key);

        if (index2 != -1)
            System.out.println("Binary Search: Found at index " + index2);
        else
            System.out.println("Book not found");
    }
}
