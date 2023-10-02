public class InsertionSort {
    public static void sort(MyComparable[] list) {
        for (int i = 0; i < list.length-1; i++) {
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
               ----------------------------------------------- */
            MyComparable min = list[i];    // Assume the first element is min
            int minIndex     = i;          // Index where min is found

            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].isLessThan(min)) { // list[k] < min
                    min      = list[k]; // Update min value
                    minIndex = k;       // Update its index
                }
            }
            /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary
               ------------------------------------------------------ */
            if (minIndex != i) {
                // Swap list[minIndex] and list[i]
                MyComparable help = list[minIndex]; // Standard exchange alg
                list[minIndex]    = list[i];
                list[i]           = help;
            }
        }
    }
}