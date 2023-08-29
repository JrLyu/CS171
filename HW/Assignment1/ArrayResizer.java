package HW.Assignment1;

public class ArrayResizer {
    
    // ******************************************************************
    // THIS IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A TUTOR   
    // OR ANSWERS WRITTEN BY OTHER STUDENTS - Jiuru Lyu
    // ******************************************************************

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        // Write this method for part A
        for (int i = 0; i < array2D.length; i++) {
            if (i == r) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (array2D[i][j] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int[][] resize(int[][] array2D) {
        // Write this method for part B
        int numRow = array2D.length;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == 0) {
                    numRow--;
                    break;
                }
            }
        }
        int[][] result = new int[numRow][array2D[0].length];
        int index = 0;
        for (int i = 0; i < array2D.length; i++) {
            int count = 0;
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] != 0) {
                    count++;
                }
            }
            if (count == array2D[i].length) {
                for (int j = 0; j < array2D[i].length; j++) {
                    result[index][j] = array2D[i][j];
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
