
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public void advance(int howManyDays) {
        int tempDay = this.day + howManyDays;
        int addMonths = this.month + tempDay / 30;
        if (tempDay > 30) {
            this.day = tempDay % 30;
        }
        
        if (addMonths > 12) {
            this.month = addMonths % 12;
            this.year += addMonths / 12;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int tempDay = this.day;
        int tempMonth = this.month;
        int tempYear = this.year;
        SimpleDate newDate = new SimpleDate(tempDay, tempMonth, tempYear);
        newDate.advance(days);
        return newDate;
    }

}
