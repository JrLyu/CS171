import java.util.Date;

public class Demo
{
    public static void main(String[] args)
    {
        Date d1 = new Date();  
        System.out.println( d1.toString() ); 

        Date d2 = new Date(0);    // EST is 4 hours behind GMT
        System.out.println( d2 ); // Same effect as d2.toString() !

        Date d3 = new Date(1000); // 1000 msec = 1 sec
        System.out.println( d3 ); // d3 is 1 sec later than d2
    } 
} 
