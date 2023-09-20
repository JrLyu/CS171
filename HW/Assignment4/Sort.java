/* ====================================================================
   selectionSort(GameCard[] list): sort an array of GameCard objects
   ==================================================================== */

public class Sort {
    // Sort an array of GameCard objects
    public static void selectionSort(GameCard[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
	          ----------------------------------------------- */
            GameCard min = list[i];     // Assume first element is min
            int minIndex = i;           // Index where min is found

            for (int k = minIndex+1; k < list.length; k++) {
                if (list[k].getCardRanking() < min.getCardRanking()) {
                    min = list[k]; // Update min value
                    minIndex = k;  // Update index
                }
            }
	    /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary;
	       ------------------------------------------------------ */
            if (minIndex != i) {   // Swap list[minIndex] and list[i]
                GameCard help = list[minIndex];
                list[minIndex] = list[i];
                list[i] = help;
            }
        }
    }
}