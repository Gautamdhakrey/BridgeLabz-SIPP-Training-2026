// Superclass
class Book {

    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title       : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

// Subclass
class Author extends Book {

    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
    }
}

// Main Class
public class LibraryManagement {

    public static void main(String[] args) {

        Author book = new Author(
                "Java Programming",
                2025,
                "James Gosling",
                "Known as the Father of Java."
        );

        book.displayInfo();
    }
}