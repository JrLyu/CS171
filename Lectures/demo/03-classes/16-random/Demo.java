import java.util.Random;

public class Demo
{
    public static void main(String[] args)
    {
        Random rg1 = new Random(); // Random Num Gen 1
        Random rg2 = new Random(); // Random Num Gen 2
        Random rg3 = new Random(); // Random Num Gen 3

        for ( int i = 0; i < 10; i++ )
	    System.out.print( rg1.nextInt()+" ");    // Randon series of int
        System.out.println();

        for ( int i = 0; i < 10; i++ )
	    System.out.print( rg2.nextInt(100)+" "); // Randon series in [0..100)
        System.out.println();

        for ( int i = 0; i < 10; i++ )
	    System.out.print( rg3.nextDouble()+" "); // Randon series in [0..1)
        System.out.println();
    } 
} 
