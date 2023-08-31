
/* ===============================================================
   A class that IMPLEMENTS an interface MUST OVERRIDE
   ALL methods declared in the interface

   NOTE:

      myInterface is considered a PARENT class of myClass !!!
   =============================================================== */
public class myClass implements myInterface
{
    // You MUST override ALL methods declared in the interface 
    public void myMethod( )
    {
        System.out.println("Success !");
    }
} 
