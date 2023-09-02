public class ArrayResizer {
    
    // ******************************************************************
    // THIS IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A TUTOR   
    // OR ANSWERS WRITTEN BY OTHER STUDENTS - Jiuru Lyu
    // ******************************************************************

    /**
     * This method returns true if all elrements of the row specified are nonzero
     * 
     * @param array2D the 2D array of inquiry
     * @param r the specified row
     * @return true if no zeros; false if contains zeros
     */
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        // Write this method for part A
        for (int i = 0; i < array2D.length; i++) { // iterate through each row
            if (i == r) { // when at the required row
                for (int j = 0; j < array2D[i].length; j++) { // iterate through each column
                    if (array2D[i][j] == 0) { // if contains zero
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * This method will resize the 2D array and yield a new array deleting all the rows containing 0.
     * @param array2D the array before modified
     * @return the array after modification
     */
    public static int[][] resize(int[][] array2D) {
        // Write this method for part B
        int numRow = array2D.length; // create a variable to indicate the number of rows of the result array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) { // iterate through the entire array
                if (array2D[i][j] == 0) { // if there is a zero
                    numRow--; // omit this row
                    break; // jump into the next row to continue testing
                }
            }
        }
        int[][] result = new int[numRow][array2D[0].length]; // create the resulting array -- (copy)
        int index = 0; // the index of iteration of the resulting array
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) { // use the method written in part A
                for (int j = 0; j < array2D[i].length; j++) {
                    result[index][j] = array2D[i][j]; // copy the array
                }
                index++;
            }
        }
        return result;
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
