import java.util.Arrays;

public class HW1TestB {
    public static void main(String[] args) {
        int err = 0;

        // Test 1
        int[][] arr = {{2, 1, 0},
                       {1, 3, 2},
                       {0, 0, 0},
                       {4, 5, 6}};
        int[][] sol = {{1, 3, 2}, {4, 5, 6}};
        int[][] out = ArrayResizer.resize(arr);

        if (! equal(sol, out)) {
            System.out.println("Test 1 failed");
            System.out.print("Your output = ");
            System.out.println(Arrays.toString(out));
            System.out.print("Correct output = ");
            System.out.println(Arrays.toString(sol) + "\n");
            err++;
        }

        // Copy test
        out[0][0] = 99;          // This must NOT change arr[1][0]
        if (arr[1][0] == 99) {
            System.out.println("Copy test failed: you made an alias, not a copy");
            err++;
        }

        // Test 2
        int[][] arr2 = {{2, 1, 0, 8},
                        {1, 3, 2, 8},
                        {0, 3, 2, 8},
                        {1, 3, 0, 8},
                        {0, 0, 0, 8},
                        {4, 5, 6, 8}};
        int[][] sol2 = {{1, 3, 2, 8}, {4, 5, 6, 8}};
        out = ArrayResizer.resize(arr2);

        if (! equal(sol2, out)) {
            System.out.println("Test 2 failed");
            System.out.print("Your output = ");
            System.out.println(Arrays.toString(out));
            System.out.print("Correct output = ");
            System.out.println(Arrays.toString(sol2) + "\n");
            err++;
        }

        // Copy test
        out[0][0] = 99;          // This must NOT change arr[1][0]
        if (arr[1][0] == 99) {
            System.out.println("Copy test failed: you made an alias, not a copy");
            err++;
        }

        // Test 3
        int[][] arr3 = {{1, 2, 1, 9, 8},
                        {1, 1, 3, 2, 8},
                        {1, 4, 5, 6, 8}};
        out = ArrayResizer.resize(arr3);

        if (! equal(arr3, out)) {
            System.out.println("Test 3 failed");
            System.out.print("Your output = ");
            System.out.println(Arrays.toString(out));
            System.out.print("Correct output = ");
            System.out.println(Arrays.toString(arr3) + "\n");
            err++;
        }

        // Copy test
        out[0][0] = 99;          // This must NOT change arr[0][0]
        if (arr[0][0] == 99) {
            System.out.println("Copy test failed: you made an alias, not a copy");
            err++;
        }

        if (err == 0) {
            System.out.println("Part B of assignment passed");
        }
    }

    public static boolean equal(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }

        if (a[0].length != b[0].length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
