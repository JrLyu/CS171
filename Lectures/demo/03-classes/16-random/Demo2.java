import java.util.Random;

public class Demo2
{
    public static void main(String[] args)
    {
        Random rg1 = new Random(4); // Random Num Gen 1 with seed = 4
        Random rg2 = new Random(4); // Random Num Gen 2 with seed = 4

        for ( int i = 0; i < 10; i++ )
	    System.out.print( rg1.nextInt(100)+" "); // "Random" series 1
        System.out.println();

        for ( int i = 0; i < 10; i++ )
	    System.out.print( rg2.nextInt(100)+" "); // Same series !!!
        System.out.println();
    } 
} 
