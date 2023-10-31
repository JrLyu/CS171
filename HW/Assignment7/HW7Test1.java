public class HW7Test1 {
    public static void main(String[] args) {
        GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();


        int err = 0, k = 0;
        String[] ans = {  "[NULL]",
                          "56 -> [NULL]",
                          "56 -> 78 -> [NULL]",
                          "23 -> 56 -> 78 -> [NULL]",
                          "23 -> 56 -> 78 -> 89 -> [NULL]",
                          "23 -> 34 -> 56 -> 78 -> 89 -> [NULL]",
                          "12 -> 23 -> 34 -> 56 -> 78 -> 89 -> [NULL]",
                          "12 -> 23 -> 34 -> 45 -> 56 -> 78 -> 89 -> [NULL]",
                          "12 -> 23 -> 34 -> 45 -> 56 -> 67 -> 78 -> 89 -> [NULL]"
        };

        System.out.print("\nInitial list:      ");
        System.out.println("  " + intList);

        // Insert out of range (1)
        boolean caught = false;
        try {
            intList.addAt(99, 1);
        } catch (Exception e) {
            caught = true;
        }

        if (!caught) {
            err++;
            System.out.print("\n-- Error: no exception intList.addAt(99, 1)\n");
        }
        System.out.print("\nAfter addAt(99, 1):");
        System.out.println("  " + intList);

        k = 0;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(56, 0);
        System.out.print("\nAfter addAt(56, 0):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(78, 1);
        System.out.print("\nAfter addAt(78, 1):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(23, 0);
        System.out.print("\nAfter addAt(23, 0):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(89, 3);
        System.out.print("\nAfter addAt(89, 3):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(34, 1);
        System.out.print("\nAfter addAt(34, 1):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(12, 0);
        System.out.print("\nAfter addAt(12, 0):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(45, 3);
        System.out.print("\nAfter addAt(45, 3):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        intList.addAt(67, 5);
        System.out.print("\nAfter addAt(67, 5):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        // Insert out of range (2)
        caught = false;
        try {
            intList.addAt(99, 9);
        } catch (Exception e) {
            caught = true;
        }

        if (!caught) {
            err++;
            System.out.print("\n-- Error: no exception intList.addAt(99, 9)");
        }

        System.out.print("\nAfter addAt(99, 9):");
        System.out.println("  " + intList);

        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        if (err == 0) {
            System.out.println("\nTest 1 passed\n");
        } else {
            System.out.println("\nTest 1 unsuccessful\n");
        }
    }
}