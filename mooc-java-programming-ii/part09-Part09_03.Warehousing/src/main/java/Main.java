

public class Main {

    public static void main(String[] args) {
        ProductWarehouse pw = new ProductWarehouse("chocolate",10); 
        pw.addToWarehouse(5); 
        System.out.print(pw);
    }
}
