public class SavingAccount extends Account {
    //savings account cannot be overdrawn.
    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= super.getBalance()) {
            super.withdraw(amount);
        }
        else {
            System.out.println("unable to overdrawn");
        }
    }
}
