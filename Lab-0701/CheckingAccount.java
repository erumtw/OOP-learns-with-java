import java.util.Set;

public class CheckingAccount extends Account{
    //A checking account has an overdraft limit
    private double overDraftLimit;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance){
        super(id, balance);
    }
    public double getOverdraftLimit() {
        return overDraftLimit;
    }

    public void setOverdraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= overDraftLimit + super.getBalance()) {
            super.withdraw(amount);;
        }
        else {
            System.out.println("Cannot withdraw more than the overdraft limit");
        }
    }
}
