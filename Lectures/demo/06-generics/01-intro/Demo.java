
public class Demo
{
   public static void main(String[] args) 
   {
      StringStore a = new StringStore("Hello");
    
      System.out.println(a.getData());

      // Java knows that a.getData() returns a String
      //
      //    a.getData() + a.getData() will concatenate
      System.out.println(a.getData() + a.getData());
   }
}
