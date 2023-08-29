package HW.Assignment1;

public class TestA {
    public static void main(String[] args) {
	    // Test 1
        int[][] arr = {{2, 1, 0}, 
		               {1, 3, 2}, 
		               {0, 0, 0}, 
		               {4, 5, 6}};  
        
        int err = 0;
        int totErr;
        
        if (ArrayResizer.isNonZeroRow(arr, 0) != false) {
	        System.out.println("ArrayResizer.isNonZeroRow(arr, 0) wrong");
	        err++;
        }
        
        if (ArrayResizer.isNonZeroRow(arr, 1) != true) {
	        System.out.println("ArrayResizer.isNonZeroRow(arr, 1) wrong");
	        err++;
        }

        if (ArrayResizer.isNonZeroRow(arr, 2) != false) {
            System.out.println("ArrayResizer.isNonZeroRow(arr, 2) wrong");
            err++;
        }

        if (ArrayResizer.isNonZeroRow(arr, 3) != true) {
            System.out.println("ArrayResizer.isNonZeroRow(arr, 3) wrong");
            err++;
        }

        if (err != 0) {
	        System.out.println("Test 1 of part A failed");
        }
	    totErr = err;

	    // Test 2
        int[][] arr2 = {{2, 1, 1, 8},
                        {1, 0, 0, 8},
                        {8, 0, 6, 8}};
        err = 0;

        if (ArrayResizer.isNonZeroRow(arr2, 0) != true) {
            System.out.println("ArrayResizer.isNonZeroRow(arr2, 0) wrong");
            err++;
        }

        if (ArrayResizer.isNonZeroRow(arr2, 1) != false) {
            System.out.println("ArrayResizer.isNonZeroRow(arr2, 1) wrong");
            err++;
        }

        if (ArrayResizer.isNonZeroRow(arr2, 2) != false) {
            System.out.println("ArrayResizer.isNonZeroRow(arr2, 2) wrong");
            err++;
        }

        if (err != 0) {
            System.out.println("Test 2 of part A failed");
        }
	    totErr += err;

	    if (totErr == 0) {
	        System.out.println("Part A of assignment passed");
        }
    }
}