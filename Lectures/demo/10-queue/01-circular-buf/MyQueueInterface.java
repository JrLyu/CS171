interface MyQueueInterface<E>
{
   public boolean isEmpty(); // returns true is stack is empty
   public boolean isFull();  // returns true is stack is full

   public void enqueue(E e); // Insert elem e at the back of the queue

   public E dequeue();       // Remove the elem at the front
                             // of the queue and return it

   public E peek();          // Return the elem at the front
			     // without removing it
}
