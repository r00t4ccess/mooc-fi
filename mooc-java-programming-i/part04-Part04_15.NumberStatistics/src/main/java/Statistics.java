
public class Statistics {
    private int count;
    private int total;
    
    public Statistics() {
        this.count = 0;
        this.total = 0;
    }
    
    public void addNumber(int number) {
        this.total = this.total + number;
        this.count++;
    }
    public int getCount() {
        return this.count;
    }
    public int sum() {
        if (this.total == 0) {
            return 0;
        }
        return this.total;
    }
    public double average() {
        if (this.total == 0 ) {
            return 0.0;
        }
        return (double) this.total / this.count;
    }
    
}
