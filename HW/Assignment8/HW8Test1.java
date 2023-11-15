public class HW8Test1 {
    public static void main(String[] args) {
        int[] test = new int[]{10, 100, 500, 1000, 5000, 10000};

        int err = 0;

        for (int N : test) {
            int c = 0;

            for (int i = 0; i < N; i = i + 2) {
                for (int j = i; j < N; j++) {
                    c++;
                }
            }
            System.out.println("Test N = " + N);
            System.out.println("# time loop executed = " + c);
            System.out.println("(N^2 + 2N)/4 = " + (double)(N*N + 2*N)/4);

            if (c != (N*N + 2*N)/4) {
                System.out.println("Incorrect when test N = " + N);
                err++;
            }
        }

         if (err == 0) {
             System.out.println("\nTest 1 passed\n");
         }
    }
}
