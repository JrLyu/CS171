interface MyStackInterface<E>
{
   public boolean isEmpty(); // returns true is stack is empty
   public boolean isFull();  // returns true is stack is full

   public void push(E e);    // Pushes elem e on the stack
   public E pop();           // Remove the elem at the top
                             // of the stack and return it
   public E peek();          // Return the elem at the top 
                             // without removing it
}
