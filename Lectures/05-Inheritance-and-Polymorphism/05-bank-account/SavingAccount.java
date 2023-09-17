public class SavingAccount extends BankAccount{
    private double interestRate = 0.05;
    private final static int MAXNUMFREE = 3;
    private final static double PENALTY = 1.0;
    private int numWithdrawals;

    public SavingAccount(double x){
        super(x);
    }

    // Reset # withdrawal at end of month
    public void resetWithdrawals() {
        numWithdrawals = 0;
    }

    public void withdraw(double amount) { // overrides
        super.withdraw(amount);
        numWithdrawals++;
        if ( numWithdrawals > MAXNUMFREE )
            super.withdraw(PENALTY); // penalty
    }

    public void addInterest() {
        deposit(interestRate / 12 * getBalance());
    }
}
