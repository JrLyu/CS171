
public class Demo implements Test1
{ 
    public void show()
    {
        System.out.println("Demo: implemented method.");
    }
 
    public static void main(String[] args) 
    { 
        Test1 a = new Demo();

        a.show();
    } 
}
