
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
        System.out.println("---");
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }
    
    public static void printValues(HashMap<String,Book> hashmap) {
        for (String i : hashmap.keySet()) {
            System.out.println(hashmap.get(i).toString());
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String i : hashmap.keySet()) {
            if (hashmap.get(i).getName().contains(text)) {
                System.out.println(hashmap.get(i));
            }
        }
    }

}
