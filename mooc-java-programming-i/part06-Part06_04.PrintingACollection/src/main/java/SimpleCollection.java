
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
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
    
    public String toString() {
        String output = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return output + " is empty.";
        }
        String elementList = "";
        for (String i: elements) {
            if (i.equals(elements.get(elements.size() - 1))) {
                elementList = elementList + i;
            } else {
                elementList = elementList + i + "\n";
            }
            
        }
        String elsize;
        if (this.elements.size() == 1) {
            elsize = " has " + this.elements.size() + " element:";
        } else {
            elsize = " has " + this.elements.size() + " elements:";
        }
        
        return output + elsize + "\n" + elementList;
    }
}
