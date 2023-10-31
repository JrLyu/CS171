public class HW7Test2 {
    public static void main(String[] args) {
        GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();

        intList.addFirst(89);
        intList.addFirst(78);
        intList.addFirst(68);
        intList.addFirst(56);
        intList.addFirst(34);
        intList.addFirst(23);
        intList.addFirst(12);
        System.out.println("Initial list:       " + intList);
        // 12 -> 23 -> 34 -> 56 -> 67 -> 78 -> 89

        int err = 0, k = 0;
        String[] ans = {  "23 -> 34 -> 56 -> 68 -> 78 -> 89 -> [NULL]",
                          "23 -> 56 -> 68 -> 78 -> 89 -> [NULL]",
                          "23 -> 56 -> 68 -> 78 -> [NULL]",
                          "23 -> 56 -> 78 -> [NULL]",
                          "23 -> 56 -> [NULL]",
                          "56 -> [NULL]",
                          "[NULL]"
        };

        intList.removeAt(0);
        System.out.print("\nAfter removeAt(0):");
        System.out.println("  " + intList);

        k = 0;
        if (! intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        intList.removeAt(1);
        System.out.print("\nAfter removeAt(1):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        intList.removeAt(4);
        System.out.print("\nAfter removeAt(4):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        intList.removeAt(2);
        System.out.print("\nAfter removeAt(2):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        intList.removeAt(2);
        System.out.print("\nAfter removeAt(2):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        intList.removeAt(0);
        System.out.print("\nAfter removeAt(0):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        // **************************
        // Delete out of range (1)
        // **************************
        boolean caught = false;
        try {
            intList.removeAt(1);
        } catch (Exception e) {
            caught = true;
        }

        if (!caught) {
            err++;
            System.out.print("\n-- Error: no exception intList.removeAt(1)");
        }

        System.out.print("\nAfter removeAt(1):");
        System.out.println("  " + intList);

        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        // **************************
        // Delete to empty list
        // **************************
        intList.removeAt(0);
        System.out.print("\nAfter removeAt(0):");
        System.out.println("  " + intList);

        k++;
        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans = " + ans[k] );
        }

        // **************************
        // Delete out of range (2)
        // **************************
        caught = false;
        try {
            intList.removeAt(0);
        } catch (Exception e) {
            caught = true;
        }

        if (!caught) {
            err++;
            System.out.print("\n-- Error: no exception intList.removeAt(0)");
        }

        System.out.print("\nAfter removeAt(0):");
        System.out.println("  " + intList);

        if (!intList.toString().equals(ans[k])) {
            err++;
            System.out.println("-- incorrect, ans =  " + ans[k] );
        }

        if (err == 0) {
            System.out.println("\nTest 2 passed\n");
        }
    }
}