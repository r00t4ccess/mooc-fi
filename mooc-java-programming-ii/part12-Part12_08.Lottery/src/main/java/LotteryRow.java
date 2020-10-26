
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random rando = new Random();
        this.numbers = new ArrayList<>();
        while (this.numbers.size() < 7){
            int ranNum = rando.nextInt(40) + 1;
            if (!this.numbers.contains(ranNum)) {
                this.numbers.add(ranNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number); 
    }
}

