
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer t = new Timer();
        int i = 0;
        while (i < 1219) {
            t.advance();
            i++;
        }
        System.out.println(t);
    } 
}
