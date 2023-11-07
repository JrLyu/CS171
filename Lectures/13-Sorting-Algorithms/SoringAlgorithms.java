public class SoringAlgorithms {
    public static void main(String[] args) {

    }

    /**
     * The generic method for exchanging elements in an array
     *
     * @param a the array
     * @param i index of one of the elements being changed
     * @param j index of the other element being changed
     * @param <T> DataType that implements the Comparable interface (that is, public int compareTo(T o); is defined)
     */
    private static <T extends Comparable<T>> void exch(T[] a, int i, int j ) {
        T help;

        help = a[i];
        a[i] = a[j];
        a[j] = help;
    }

    /**
     * The generic method for selection sort
     *
     */

}
