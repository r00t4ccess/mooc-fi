
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int tempEuro = addition.euros + this.euros;
        int tempCents = addition.cents + this.cents;
        if (tempCents > 100) {
            tempEuro = tempEuro + (tempCents / 100);
            tempCents = tempCents % 100;
        }
        Money newMoney = new Money(tempEuro, tempCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        Money input = (Money) compared;
        return this.euros < input.euros || (this.euros == input.euros && this.cents < input.cents);
    }
    
    public Money minus(Money decreaser) {
        int tempCents = (this.euros * 100) + this.cents;
        int tempDecreaser = (decreaser.euros * 100) + decreaser.cents;
        int tempTotal = tempCents - tempDecreaser;
        System.out.println(tempTotal);
        int totalEuro = 0;
        int totalCents = 0;
        if (tempTotal < 0) {
            totalEuro = 0;
            totalCents = 0;
        } else {
            totalEuro = tempTotal / 100;
            totalCents = tempTotal % 100;
        }
        Money newMoney = new Money(totalEuro, totalCents);
        return newMoney;
    }

}
