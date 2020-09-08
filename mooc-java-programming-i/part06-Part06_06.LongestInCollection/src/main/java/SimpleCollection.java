
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private String nameLongest;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        nameLongest = "";
        if (this.elements.isEmpty()) {
            return null;
        }
        for (String i : this.elements)
            if (i.length() > nameLongest.length()) {
                nameLongest = i;
            }
        return nameLongest;
    }

}
