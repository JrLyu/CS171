# Stack

## Introduction to Stack
- There are 2 commonly used data structures: 
  - Stack (LIFO)
  - Queue (FIFO)
- A **stack** is a data structure that organize the stored data in a **Last In First Out (LIFO)** manner.
- To achieve the LIFO behavior, the stack only provide the following 2 methods to access the data stored in a stack:
  - `push(x)`: add `x` to the "top" of the stack.
  - `pop()`: remove the item at the "top" of the stack and return it. 
  - The item removed by `pop()` is always the last item that was pushed. 
- Method invocation/return: 
  - If the order of method invocation is 
  ```
  M1() --> M2() --> M3() --> M4()
  ```
  - Then the order in which the methods return form their invocation is the reverse order: 
  ```
  M4() --> M3() --> M2() --> M1()
  ```
  - Some computer algorithms/processes with a natural LIFO behavior: undo algorithm in a text editor (it uses a stack to store the history of edit changes); back algorithm in a browser (it uses a stack to store the browser history)

## The Stack Interface
- The stack interface definition:
  - The stack only defines a behavior on the access of the data stored in a stack: `pop()` must return the last item that was pushed
  - The stack does not specify how the data must be stored.
  - There are different ways to implement the same behavior
```java
public interface MyStackInterface<E> {
    boolean isEmpty(); // returns true if stack is empty
    boolean isFull(); // returns true if stack is full
    void push(E e); // pushes element e on the stack
    E pop(); // Remove the element at the top of the stack and return it
    E peek(); // Return the element at the top without removing it
}
```

## Implementing the Stack with a fixed size array
- The basic implementation of a Stack is using:
  - A fixed size array to store the data items
  - A `stackTop` index variable to record the first open position in the array
- The initial state of the stack when it is instantiated (=created): `stackTop = 0` (can also use `stackTop = -1`)
```java
public class IntegerStack implements Stack<Integer> {
    private Integer[] item;
    private int stackTop;
    public IntegerStack(int N) { // Create a stack of size N
    item = new Integer[N];
    stackTop = 0;
    }
    public boolean isEmpty() { // Test if stack is empty
        return stackTop == 0;
    }
    public boolean isFull() { // Test if stack is empty
        return stackTop == item.length;
    }
    public void push(Integer e) {
        if (isFull()) {
            System.out.println("Full");
            return; // Or: throw an exception
        }
        item[stackTop] = e; // (1) store item
        stackTop++; // (2) increment stackTop
    }
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null; // Or: throw an exception
        }
        stackTop--; // (1) decrement stackTop
        return item[stackTop]; // (2) return item
    }
}
```
- * See `IntegerStack.java` and `TestIntegerStack.java`.

## Implement the stack with a dynamic array
- The stack can be implemented using a dynamic array
```java
public class IntegerStack implements Stack<Integer> {
    private Integer[] item;
    private int stackTop;
    private final double DELTA = 0.25;
    
    public IntegerStack(int N) { // Create a stack of size N
    item = new Integer[N];
    stackTop = 0;
    }
    public boolean isEmpty() { // Test if stack is empty
        return stackTop == 0;
    }
    public boolean isFull() { // Test if stack is empty
        return stackTop == item.length;
    }
    public void push(Integer e) {
        if (isFull()) {
            // Double the array size
            Integer[] temp = new int[2 * item.length];
            for (int i = 0; i < item.length; i++) {
                temp[i] = item[i];
            }
            item = temp;
        }
        item[stackTop] = e; // (1) store item
        stackTop++; // (2) increment stackTop
    }
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return null; // Or: throw an exception
        }
        stackTop--; // (1) decrement stackTop
        Integer retVal = item[stackTop];
        if (stackTop < DELTA * item.length && item.length >= 2) {
            // Reduce the array by half
            temp = new int[item.length / 2];
            for (int i = 0; i <= stackTop; i++) {
                temp[i] = item[i];
            }
            item = temp;
        }
        return retVal; // (2) return item
    }
}
```
- The value `DELTA` determines when we will reduce the size of the array: `DELTA` is a wastage threshold:
  - When only the fraction of `DELTA` of the array is being used, we will reduce the wastage. 
  - Since we will reduce the array by half, `DELTA` must be at most 0.5. Otherwise, we will discard some valid entries in the stack.
  - `DELTA` = 0.25 is actually better than 0.5