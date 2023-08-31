
public class Demo6
{
   public static void main(String[] args) 
   {
      GenericStore<String>  a = new GenericStore<String>("Hello");
      GenericStore<Integer> b = new GenericStore<Integer>(12345);
    
      System.out.println(a.getData()); // a.getData() is casted to String
      System.out.println(b.getData()); // b.getData() is casted to Integer

      // NOW the + operator works:
      System.out.println(a.getData() + a.getData()); // + on String
      System.out.println(b.getData() + b.getData()); // + on Integer
   }
}
