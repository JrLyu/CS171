
// Interface definition for the Double-Ended Queue

public interface DEQueue<E> {
    public boolean isEmpty();  // returns true is stack is empty

    public boolean isFull();   // returns true is stack is full

    public void addFirst(E e); // Insert elem e at the front of the queue

    public void addLast(E e);  // Insert elem e at the end of the queue

    public E removeFirst();    // Remove the elem at the front of the queue and return it

    public E removeLast();     // Remove the elem at the end of the queue and return it
}