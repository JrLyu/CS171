import java.util.Date;

public class Demo2
{
    public static void main(String[] args)
    {
        long  result;

        Date myDate = new Date(0);  
        result = myDate.getTime();
        System.out.println( result ); // 0

        myDate = new Date(1000);  
        result = myDate.getTime();
        System.out.println( result ); // 1000

        myDate = new Date();  
        result = myDate.getTime();
        System.out.println( result ); // # msec since Jan 1, 1970
    } 
} 
