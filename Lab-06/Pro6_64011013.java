import java.util.Scanner;

public class Pro6_64011013 {
    public static void main(String[] args) {
        Account[] acc = new Account[10];
        for (int i = 0; i < 10; i++) {
            acc[i] = new Account(i, 100);
        }

        Scanner in = new Scanner(System.in);

        int id, choice;

        System.out.print("Enter an id: ");
        id = in.nextInt();

        boolean run = true;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("The balance is " + acc[id].getBalance());
            }
            else if (choice == 2) {
                System.out.print("Enter ab amount to withdraw: ");
                acc[id].withdraw(in.nextDouble());
            }
            else if (choice == 3) {
                System.out.print("Enter an amount to deposit: ");
                acc[id].deposit(in.nextDouble());
            }
            else {
                System.out.println("Exited....");
                run = false;
            }

        } while (run);
        in.close();
    } 
}
