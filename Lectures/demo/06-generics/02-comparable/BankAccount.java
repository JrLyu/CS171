
// BankAccount implements the ComparableThing interface for BankAccount ONLY

public class BankAccount implements ComparableThing<BankAccount>
{
    private double balance;

    public BankAccount(double x)
    {
        balance = x;
    }

    public double getBalance()
    {
        return balance;
    }

    // We can override compareTo( ) using BankAccount because T = BankAccount

    public int compareTo( BankAccount other )
    {   
        // Data type of other is BankAccount --> no downcasting required !

        double diff = this.getBalance() - other.getBalance(); 
        return (int) Math.signum(diff);
    }
} 

