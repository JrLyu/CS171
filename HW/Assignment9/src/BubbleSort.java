import java.util.Arrays;

public class BubbleSort<T> {
    public static <T extends Comparable<T>> int sort(T[] arr, String[] ans) {
        int n = arr.length;
        int err = 0;
        String s;

        for (int i = 0; i < n-1; i++) { // Repeat n-1 times
            s = Arrays.toString(arr);
            System.out.println("Student: " + s);
            if (!s.equals(ans[i])) {
                System.out.println("Wrong, correct: "+ ans[i]);
                err++;
            }
            for ( int j = 0; j < n-1-i; j++ ) {
                if (arr[j].compareTo(arr[j + 1]) > 0) { // Compare adj elems
                    exch(arr, j, j + 1);  // Swap list[j] and list[j+1]
                }
            }
        }

        s = Arrays.toString( arr );
        System.out.println( "Student: " + s );
        if (! s.equals(ans[n-1]) ) {
            System.out.println("Wrong, correct: "+ ans[n-1] );
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
