import java.util.Arrays;

public class SelectionSort<T> {
    public static <T extends Comparable<T>> int sort(T[] arr, String[] ans) {
        int n = arr.length;
        int err = 0;
        String s;

        for (int i = 0; i < n-1; i++) {
            s = Arrays.toString(arr);
            System.out.println("Student: " + s);
            if (!s.equals(ans[i])) {
                System.out.println("Wrong, correct: "+ ans[i] );
                err++;
            }

            /* -----------------------------------------------
               Find the minimum in the arr[i..n-1]
               ----------------------------------------------- */
            T min = arr[i];     // Assume first element is min
            int minIndex = i;   // Index where min is found

            for (int k = minIndex+1; k < n; k++) {
                if (arr[k].compareTo(min) < 0) { // Compare arr[k] and min
                    min = arr[k]; // Update min
                    minIndex = k;      // Update its index
                }
            }
            /* ------------------------------------------------------
               Swap arr[i] with arr[minIndex] if necessary
               ------------------------------------------------------ */
            if (minIndex != i) {
                exch(arr, i, minIndex); // Swap arr[minIndex] and arr[i]
            }
        }

        s = Arrays.toString(arr);
        System.out.println("Student: " + s);
        if (!s.equals(ans[n-1])) {
            System.out.println("Wrong, correct: "+ ans[n-1]);
            err++;
        }
        return err;
    }

    private static <T extends Comparable<T>> void exch(T[] a, int i, int j) {
        T help;

        help = a[i];
        a[i] = a[j];
        a[j] = help;
    }
}
