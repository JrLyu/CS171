
// There is no "package" statement ---> class is in "default" package

/* ---------------------------------------------------
   In order to use Circle, we must IMPORT the clas
   -------------------------------------------------- */
import Geometrics.*;

public class NewCircle extends Circle
{
    NewCircle(String c, double r)
    {
        super(c, r);
    }
    
    /* --------------------------------------------------------------
       A method in a subclass can access "protected" member directly
       -------------------------------------------------------------- */
    public void accessInheritedProtected()
    {
        System.out.println("NewCircle radius = " + radius);
    }
}

