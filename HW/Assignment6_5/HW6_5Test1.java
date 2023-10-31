public class HW6_5Test1 {
    public static void main(String[] args) {
        DEQueue<Integer> q = new CircularBuffer<>(6);
        Integer[] inp = {5, 1, 8, 9, 4, 7};
        String[]  ans = {" 5", " 5 1", " 5 1 8", " 5 1 8 9",
                         " 5 1 8 9 4", " 5 1 8 9 4"};
        String    out = null;
        int err = 0;

        // System.out.println("q = " + q);

        for (int i = 0; i < inp.length; i++) {
            try {
                q.addLast(inp[i]);
                if (i == inp.length-1) {
                    err++;              // Should not come here
                }

                out = q.toString();
                System.out.println("Student = " + out);
                System.out.println("Correct = " + ans[i]);
                if (out.compareTo(ans[i]) != 0) {
                    err++;
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("Student = " + out);
                System.out.println("Correct = " + ans[i]);
                if (out.compareTo(ans[i]) != 0) {
                    err++;
                }
            }
        }

        if (err == 0) {
            System.out.println("\nTest 1 passed");
        } else {
            System.out.println("\nTest 1 failed");
        }
    }
}