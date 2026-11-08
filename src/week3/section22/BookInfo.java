package week3.section22;

public class BookInfo {

    // Instance variables
    String title;
    String author;
    String yearPublished;

    // Instance method
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
    }

    public static void main(String[] args) {

        // Create a Main object
        BookInfo book = new BookInfo();

        // Set instance variables
        book.title = "Leonardo da Vinci";
        book.author = "Isaacson, Walter";
        book.yearPublished = "October 17, 2017";

        // Call the displayInfo method
        book.displayInfo();
    }
}
