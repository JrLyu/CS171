
/* ============================================================
   Demo using interface variable
   ============================================================ */   

public class Demo
{
    public static void main(String[] args)
    {
        // (1) Normal way of using objects
        myClass a = new myClass();
        a.myMethod();

	// This is an UPCASTING operation: myInterface is a parent class !
        myInterface b = new myClass();  // Upcasting !
        b.myMethod();			// Polymorphism !
    }
}
