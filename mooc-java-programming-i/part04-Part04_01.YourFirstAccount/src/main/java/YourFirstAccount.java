
public class YourFirstAccount {

    public static void main(String[] args) {
        Account larryAccount = new Account("Larry's account", 100.00);
        larryAccount.deposit(20);
        System.out.println(larryAccount);
    }
}
