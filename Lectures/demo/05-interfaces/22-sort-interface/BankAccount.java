

public class BankAccount implements ComparableThing
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

    // We must override compareTo( ) using same signature in ComparableThing

    public int compareTo( ComparableThing other )
    {   
        BankAccount help = (BankAccount) other;

        double diff = this.getBalance() - help.getBalance(); 
        return (int) Math.signum(diff);
    }
} 

