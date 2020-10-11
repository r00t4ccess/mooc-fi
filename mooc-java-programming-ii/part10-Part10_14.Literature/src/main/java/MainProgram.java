
import java.util.Scanner;
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                System.out.println("Input the age recommendation:");
                int age = Integer.valueOf(scanner.nextLine());
                Book book = new Book(title, age);
                books.add(book);
            }
            
        }
        
        System.out.println(books.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        
        Collections.sort(books, comparator);
        
        for (Book i: books) {
            System.out.println(i);
        }
    }

}
