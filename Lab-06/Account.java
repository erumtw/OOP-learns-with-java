import java.util.Date;

/**
 * Account
 */
public class Account {
    private int id;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;
    
    public Account () {
        dateCreated = new Date();
    }

    public Account (int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
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

    public void withdraw(double balance) {
        this.balance -= balance;
    } 

    public void deposit(double balance) {
        this.balance += balance;
    }
}