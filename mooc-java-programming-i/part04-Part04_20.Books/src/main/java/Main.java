import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
        while (true) {
            //System.out.println("Title:");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            //System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            //System.out.println("Publication Year:");
            int year = Integer.valueOf(scan.nextLine());

            Book book = new Book(title, pages, year);
            library.add(book);
        }
        System.out.println("What information will be printed? ");
        String resp = scan.nextLine();
        if (resp.toLowerCase().equals("everything")) {
            for (Book i : library) {
                i.info();
            }
        } else if (resp.toLowerCase().equals("name")) {
            for (Book i : library) {
                i.title();
            }
        }
    }
}
