
public class GenericStore<T>  // T is the type parameter
{
   private T data;    // variable of T type

   public GenericStore(T data) 
   {
      this.data = data;
   }

   public T getData() // returns T type variable
   {
      return this.data;
   }
}

