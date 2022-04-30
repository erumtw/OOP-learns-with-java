import javax.print.event.PrintEvent;

public class Lab5_1_64011013 {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000.0);
        acc.setAIR(4.5);
        acc.withdraw(2500.0);
        acc.deposit(3000.0);
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("Monthly interest: $" + acc.getMonthlyInterest());
        System.out.println("Date: " + acc.getDateCreate() + "\n");
    }
}
