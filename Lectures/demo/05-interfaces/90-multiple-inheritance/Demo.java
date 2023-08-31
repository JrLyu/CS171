
public class Demo implements Test1, Test2
{ 
    public void show()
    {
        System.out.println("Implemented method.");
    }
 
    public static void main(String[] args) 
    { 
        Test1 a = new Demo();
        Test2 b = new Demo();

        a.show();
        b.show();
    } 
}
