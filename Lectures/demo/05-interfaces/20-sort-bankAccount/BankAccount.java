
public class BankAccount
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

    public int compareTo( BankAccount other )
    {
        double diff = this.getBalance() - other.getBalance();
        return (int) Math.signum(diff);
    }
}  
