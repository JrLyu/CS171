/* --------------------------------------------------------------
   I added the IMPLICIT parameter "this" to EVERY memory access
   -------------------------------------------------------------- */
public class Circle 
{
    public double radius = 1; 

    public Circle()          
    { 
    
    } 

    public Circle(double radius) // ** the param variable "radius" take precedence
    {
        this.radius = radius;
    }

    public double getArea()  
    {
        return 3.14159 * this.radius * this.radius;
    }

    public void setRadius(double radius) // ** radius --> use the param variable
    {
       this.radius = radius;
    }
} 
