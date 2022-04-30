public class Pro2 {
    public static void main(String[] args) {
        Account acc = new Account("7057", 112, 1120);
        System.out.println("Name: " + acc.getName());
        System.out.println("Account ID: " + acc.getName());
        acc.setAIR(1.65);
        System.out.println("Annual interest rate: " + acc.getAIR());
        System.out.println("Balance: " + acc.getBalance());
        
        acc.deposit(100);
        acc.deposit(400);
        acc.deposit(200);

        acc.withdraw(1000);
        acc.withdraw(400);
        acc.printHistory();
        
    }
}
