import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int caseNum = 5;

        Integer[] a = {2, 9, 8, 4, 7, 6, 1};
        test(caseNum, a);

        String[] b = {"xyz", "abc", "uvw", "klm"};
        test(caseNum, b);
    }

    /**
     * The generic method for exchanging elements in an array
     *
     * @param a the array
     * @param i index of one of the elements being changed
     * @param j index of the other element being changed
     * @param <T> Data type that implements the Comparable interface (that is,
     *           public int compareTo(T o); is defined)
     */
    private static <T extends Comparable<T>> void exch(T[] a, int i, int j ) {
        T help;

        help = a[i];
        a[i] = a[j];
        a[j] = help;
    }

    /**
     * The generic method for selection sort
     * @param list The array to be sorted
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        for (int i = 0; i < list.length-1; i++) {
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
               ----------------------------------------------- */
            T min = list[i];  // Assume the first element is min
            int minIndex = i; // Index where min is found

            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].compareTo(min) < 0) { // compare list[k] and min
                    min = list[k]; // Update min value
                    minIndex = k;  // Update its index
                }
            }
            /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary
               ------------------------------------------------------ */
            if (minIndex != i) {
                exch(list, i, minIndex); // Swap list[minIndex] and list[i]
            }
            System.out.println(Arrays.toString(list));
        }
    }
    /* Running time analysis: The core of selection sort algorithm is as follows
     *  for (int i = 0; i < n-1; i++) {
     *      for (int k = i+1; k < n; k++) {
     *          doPrimitive();
     *      }
     *  }
     *
     * With the structure and running time analysis, we know this algorihtm is O(n^2). O(n^2) is bad!
     *
     * Selection sort is an in-place sorting algorithm, but it is not stable.
     */

    /**
     * The generic method for bubble sort. The bubble sort algorithm does the following:
     *      - Compare every pair of adjacent elements
     *      - Exchange (= swap) them if they are out of order
     *
     * @param list the list to be sorted
     * @param <T> Data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++) { // Repeat n-1 times
            // Compare every adjacent pair of elements
            for (int j = 0; j < n-1-i; j++) {
                if (list[j].compareTo(list[j+1]) > 0) { // If out of place
                    exch(list, j, j+1);  // Swap arr[j] and arr[j+1]
                }
                System.out.println(Arrays.toString(list));
            }
        }
    }
    /* Running time analysis:
     *  for (int i = 0; i < n-1; i++) {
     *      for ( int j = 0; j < n-1-i; j++ )
     *          doPrimitive();
     *      }
     *  }
     *
     * We will have this algorithm is O(n^2).
     *
     * Bubble sort is an in-place and stable sorting algorithm
     */

    /**
     * Improved bubble sort: the code will detect the number of swaps made in each iteration
     * If in some iterations, we made no swaps, the sorting will terminate to prevent wasting of time
     *
     * @param list the list to be sorted
     * @param <T> Data type that implements the Caomparable interface
     */
    public static <T extends Comparable<T>> void bubbleSort2(T[] list) {
        int n = list.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) { // Repeat n-1 times
            swapped = false;
            // Compare every adjacent pair of elements
            for (int j = 0; j < n-1-i; j++) {
                if (list[j].compareTo(list[j+1]) > 0) { // If out of place
                    exch(list, j, j+1);  // Swap arr[j] and arr[j+1]
                    swapped = true;
                }
            }
            if (!swapped) { // No swaps -> sorted!! -> exit the loop
                break;
            }
            System.out.println(Arrays.toString(list));
        }
    }

    /**
     * Insertion sort does the following things:
     *      - Selects the next unsorted element/key in the array
     *      - Insert (= exchange) it towards the front into its correct position
     * @param list list to be sorted
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) { // Repeat n-1 times
            // Compare arr[i] with each prior element
            for ( int j = i; j > 0; j-- ) {
                if ( list[j-1].compareTo(list[j]) > 0 ) // If out of place
                    exch( list, j-1, j);  // Swap list[j-1] and list[j]
                else
                    break;               // STOP
            }

            System.out.println( Arrays.toString( list ) );
        }
    }
    /* The loop structure is the following:
     *  for (int i = 1; i < n; i++) {
     *      for ( int j = i; j > 0; j-- ) {
     *          doPrimitive();  // Worst case analysis (ignore break)
     *      }
     *  }
     *
     * Doing the worst case analysis, we still have the running time of the algorithm is O(n^2).
     *
     * Insertion sort is in-place and stable.
     */

    /**
     * The merge algorithm. This algorithm aims to merge two sorted portions of the array,
     * and create a combined sorted array.
     *
     * The merge algorithm will only merge the array elements inside A[s] -> A[e−1].
     * The merge algorithm will not affect the array elements outside the range
     * We use 2 indexes i and j to point to the current elements in each sorted array portion:
     *      - The element A[i] is always the smallest value in the left (sorted) portion
     *      - The element A[j] is always the smallest value in the right (sorted) portion
     * We use a helper array variable H[] array to perform the merge operation:
     * We will repeatedly copy the smallest value from both arrays to H[]
     * Finally, we will copy H back to A when both sorted portions are exhausted.
     * @param A The array to be merged
     * @param s start = the start index of the first sorted portion
     * @param m middle = the start index of the second sorted portion
     * @param e end = end index of the second sorted portion
     * @param H the helper array
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void merge(T[] A, int s, int m, int e, T[] H) {
        /*
        The merge( ) method will be invoked repeatedly.
        If we create a helper array inside merge( ), we would repeatedly allocate and de-allocate memory
        That is inefficient!
        So we create the helper array in main( ) once, and pass it to merge() as parameter H[ ]
         */
        int i = s, j = m; // current elements in the left and right (sorted) portions
        int k = 0; // // Current copy location in helper array H
        while (i < m || j < e) {// loop as long as there are unprocessed items
            if (i < m && j < e) { // Case 1: Both (sorted) portions have unprocessed elements
                if (A[i].compareTo(A[j]) <= 0) {
                    H[k++] = A[i++];
                    /*
                    The above code is equivalent to:
                    H[k] = A[i];
                    i++;
                    k++;
                     */
                } else {
                    H[k++] = A[j++];
                }
            } else if (i == m) { // Case 2: The left portion is exhausted
                H[k++] = A[j++];
            } else if (j == e) { // Case 3: The right portion is exhausted
                H[k++] = A[i++];
            }
        }
        // Copying H[] back to A[]
        for (i = s, k = 0; i < e; i++, k++) {
            A[i] = H[k];
        }
    }
    /*
    Run time analysis:
        - The # times that the while-loop is executed is equal to e − s = n.
        - The # times that the for-loop is executed is equal to e − s = n.
        - Therefore: the running time of the merge( ) algorithm = 2n = O(n).
     */

    /**
     * Merge Sort:
     * Sorting an array a[ ] of n elements:
     *      1. split the array a[ ] into 2 halves:
     *          - an array left[ ] containing a[0] -> a[n/2]
     *          - an array right[ ] containing a[n/2 + 1] -> a[n-1]
     *      2. Sort both halves of the arrays (left[ ] and right[ ])
     *      3. Merge the sorted arrays into the final sorted array
     * @param A array to be sorted
     * @param s the starting index
     * @param e the ending index
     * @param H a helper array
     * @param <T> data type that implements Comparable interface
     */
    public static <T extends Comparable<T>> void mergeSort(T[] A, int s, int e, T[] H) {
        if ( e - s <= 1 ) { // A[s]..A[e] has 0 or 1 element
            return; // No need to sort an array of 1 element...
        }
        int m = (e+s) / 2; // m = middle of s and e

        /* ------------------------------------------------
            "Easy to understand" merge sort: ---> Recursion
                (1) sort the first half of the array using merge sort
                (2) sort the 2nd half of the array using merge sort
                (3) merge the 2 sorted portions
        ------------------------------------------------ */
        mergeSort(A, s, m, H);
        mergeSort(A, m, e, H);

        // Merge both sorted arrays
        merge(A, s, m, e, H); // We have discussed merge() previously !
    }
    /*
    Run time analysis:
        - Suppose that the running time of MergeSort.sort(A, n, H) is T(n):
            - T(n) = 0 for n <= 1
            - T(n) = 2 T(n/2) + cn for n >= 2, c = 2
        - 
     */


    /**
     * This is a test method for all the sorting algorihtms we have encountered
     * @param caseNum integer from 0 to 5
     * @param a the array to be sorted
     * @param <T> data type that implements the Comparable interface
     */
    public static <T extends Comparable<T>> void test(int caseNum, T[] a) {
        switch (caseNum) {
            case 0:
                System.out.println("------ Test Selection Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                selectionSort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 1:
                System.out.println("------ Test Bubble Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                bubbleSort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 2:
                System.out.println("------ Test Improved Bubble Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                bubbleSort2(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 3:
                System.out.println("------ Test Insertion Sort ------");
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                insertionSort(a);
                System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");
                break;
            case 4:
                System.out.println("------ Test Merge Algorithm ------");
                Integer[] list = {2, 9, 4, 6, 7, 3, 5, 8, 10, 1};
                //                      <----->  <----->
                //                       sorted  sorted
                Integer[] help = new Integer[list.length];      // Helper array
                System.out.println("\nBefore merging: \n" + Arrays.toString(list) + "\n");
                merge(list, 2, 5, 8, help);
                System.out.println("\nAfter merging: \n" + Arrays.toString(list) + "\n");
                break;
            case 5:
                System.out.println("------ Test Merge Sort ------");
                Object[] H = new Integer[a.length];   // Helper array for Merge
                System.out.println("Original Array: \n" + Arrays.toString(a) + "\n");
                try {
                    mergeSort(a, 0, a.length, (T[]) (H));
                    System.out.println("\nAfter sorting: \n" + Arrays.toString(a) + "\n");

                } catch (Exception e) {
                    System.out.println("Data type not supported. Try Integer. ");
                }
                break;
            default:
                System.out.println("------ Invalid Input caseNum! ------");
                break;
        }
    }
}
