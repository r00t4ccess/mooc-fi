
public class HealthStation {
    private int weighcount = 0;


    public int weigh(Person person) {
        this.weighcount++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weighcount;
    }

}
