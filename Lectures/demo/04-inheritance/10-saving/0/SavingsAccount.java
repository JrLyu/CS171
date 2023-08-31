public class SavingsAccount extends BankAccount
{   
    private double interestRate = 0.05;
    private final static int MAXNUMFREE = 3;
    private final static double PENALTY = 1.0;  
    private int numWithdrawals = 0;
                               
    public SavingsAccount(double x)
    {
        super(x);
    }

    public void withdraw(double amount)
    {
        super.withdraw(amount);

    numWithdrawals++;
    if ( numWithdrawals > MAXNUMFREE )
        super.withdraw(PENALTY); // penalty
    }

    public void addInterest()
    {
        deposit(interestRate/12*getBalance());
    }
} 
