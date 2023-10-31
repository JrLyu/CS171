/**********************************************************
 * A Generic Linked List class with a private static inner Node class.
 *********************************************************/
// We want to "throw" Java exceptions in our code,
// so we must import them first:

import java.util.NoSuchElementException;

public class GenericLinkedList<T> {
    /*******************************************************
     The private inner class "Node"
     *******************************************************/
    // make Node class name of the generic type
    private class Node<T> {
        // Node instance variable is generic
        private T item;
        private Node<T> next;

        // parameters in constructor generic
        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        public String toString(){
            return "" + this.item;
        }
    } // End of private inner class "Node"
    /*****************************************************************/

    private Node<T> first;

    // Constructs an empty list
    public GenericLinkedList() {
        first = null;
    }

    // Returns true if the list is empty
    public boolean isEmpty() {
        return first==null;
    }

    // Returns a string representation
    public String toString() {
        String output = "";

        if(first == null)
            return "[NULL]";

        Node<T> tmp = first;
        while(tmp != null) {
            output += tmp + " -> ";
            tmp = tmp.next;
        }
        output += "[NULL]";
        return output;
    }

    // Inserts a new node at the beginning of this list
    // take in generic item; Nodes are generic
    public void addFirst(T item) {
        Node<T> newNode = new Node<T>(item, first);
        first = newNode;
    }

    /* ****************************************************************/
    // Assignment part 1: write the addAt(item, pos) method
    //
    //    addAt(item, pos) inserts item at position pos in the list
    //
    // Examples:
    //    addAt(item, 0)   will insert item as the new first node
    //    addAt(item, 1)   will insert item after the first node
    //
    // Throw NoSuchElementException if pos is pass the last node
    /* ****************************************************************/
    public void addAt(T item, int pos) {
        if (pos == 0) { // Edge case: when the position of insertion is 0
            first = new Node<>(item, first);
            return;
        }
        // General Case
        int i = 0;
        // trace the current node and the previous node
        Node<T> current = first;
        Node<T> previous = first;
        while (i < pos) { // get to the pos position
            if (current == null) {
                // if the current node is null, we exhaust the linked list -> pos is greater than the length of the list
                throw new NoSuchElementException();
            }
            // update the current and previous nodes
            previous = current;
            current = current.next;
            i++;
        }
        previous.next = new Node<>(item, current); // create the insertion
    }

    /* ****************************************************************/
    // Assignment part 2: Write the removeAt(pos) method
    //
    //    removeAt(pos) Removes the node at position "pos" in the list
    //                  The item in the removed node is returned
    //
    // Examples:
    //    removeAt(0)   will remove the first node in list
    //    removeAt(1)   will remove the 2nd node in list
    //
    // Throw NoSuchElementException if pos is pass the last node
    /* ****************************************************************/
    public T removeAt(int pos) {
        if (isEmpty()) { // Edge Case I: empty list
            throw new NoSuchElementException();
        }
        if (pos == 0) { // Edge Case II: remove the first element
            T retVal = first.item;
            first = first.next;
            return retVal;
        }
        // General Case
        int i = 0;
        // trace current node and previous node
        Node<T> current = first;
        Node<T> previous = first;
        while (i < pos) { // get to the pos position
            if (current == null) {
                // when we exhaust the list but still have not got to the pos position,
                // pos is greater than the length of the list
                throw new NoSuchElementException();
            }
            previous = current;
            current = current.next;
            i++;
        }
        // At pos position, do the deletion
        T retVal = current.item;
        previous.next = current.next; // delet the current node
        return retVal;   // added so the program will compile...
    }


} // End of class