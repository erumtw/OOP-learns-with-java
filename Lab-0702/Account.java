import java.util.*;

/**
 * Account
 */
public class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;
    private String name;
    protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account () {
        dateCreated = new Date();
    }

    public Account (String name, int id, double balance) {
        this();
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAIR(){
        return annualInterestRate;
    }

    public void setAIR(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreate(){
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterest() {
        return this.balance * (annualInterestRate/100);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, ""));
    } 

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, ""));
    }
    
    public String toString() {
        return "Balance is " + balance + "\nThis account was created at " + dateCreated; 
    }

    public void printHistory() {
        System.out.println("Date\t\t\t\t\tType\t\tamount\t\tbalance");
        for (int i = 0; i < this.transactions.size(); i++) {
            System.out.println(transactions.get(i).getDate() + "\t\t" 
            + transactions.get(i).getType() + "\t\t"
            + transactions.get(i).getAmount() + "\t\t"
            + transactions.get(i).getBalance());
        }
    }
}