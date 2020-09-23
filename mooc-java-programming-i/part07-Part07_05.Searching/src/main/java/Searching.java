
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        //int numberOfBooks = Integer.valueOf(scanner.nextLine());
//        for (int i = 0; i < numberOfBooks; i++) {
//            books.add(new Book(i, "name for the book " + i));
//        }
        books.add(new Book(444711, "name for the book " + 444711));
        books.add(new Book(641632, "name for the book " + 641632));
        books.add(new Book(806014, "name for the book " + 806014));

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = -1;
        int count = 0;
        for (Book i : books) {
            if (i.getId() == searchedId) {
                index = count;
            }
            count++;
        }
        return index;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int index = -1;
        int upper = books.size() -1;
        int lower = 0;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (books.get(middle).getId() == searchedId) {
                index = middle;
                break;
            } else if (books.get(middle).getId() < searchedId) {
                lower = middle + 1;
            } else if (books.get(middle).getId() > searchedId) {
                upper = middle - 1;
            }
        }

        return index;
    }
}

