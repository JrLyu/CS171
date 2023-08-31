import java.util.Date;

public class Demo3
{
    public static void main(String[] args)
    {
        long  startTime, endTime;

        Date myDate;

        myDate = new Date();          // Record the time NOW
	startTime = myDate.getTime(); // Get start time in msec

	for ( long i = 0; i < 10000000; i++ ) ;   // Loop to pass time... 

        myDate = new Date();          // Record the time NOW
	endTime = myDate.getTime();   // Get end time in msec

        System.out.println("Program ran for : " 
                            + (endTime-startTime) + " msec");
    } 
} 
