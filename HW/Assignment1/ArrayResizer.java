package HW.Assignment1;

public class ArrayResizer {
    
    // ******************************************************************
    // THIS IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A TUTOR   
    // OR ANSWERS WRITTEN BY OTHER STUDENTS - Jiuru Lyu
    // ******************************************************************

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        // Write this method for part A
        return false;  // Statement added to prevent compile error
		               // Remove it when you write this method
    }

    public static int[][] resize(int[][] array2D) {
        // Write this method for part B
        return null; // Statement added to prevent compile error
                    // Remove it when you write this method
    }

    public static int numNonZeroRows(int[][] array2D) {
        int numNonZeroRows = 0;

        for (int i = 0; i < array2D.length; i++) {
            if(isNonZeroRow(array2D, i))
                numNonZeroRows++;
        }
        return numNonZeroRows;
    }
} 
