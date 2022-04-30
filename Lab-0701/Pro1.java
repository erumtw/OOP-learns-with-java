import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        CheckingAccount checkacc = new CheckingAccount(0, 5000);
        Scanner in = new Scanner(System.in);
        System.out.println("Checking account");

        System.out.print("Overdraft Limit: ");
        checkacc.setOverdraftLimit(in.nextDouble());

        System.out.println("Balance is " + checkacc.getBalance());

        System.out.print("Witdraw: ");
        checkacc.withdraw(in.nextDouble());

        System.out.println("Balance is " + checkacc.getBalance());
        System.out.println("This account was created at " + checkacc.getDateCreate());
    }
}
