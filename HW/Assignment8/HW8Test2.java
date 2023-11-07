public class HW8Test2 {
    public static void main(String[] args) {
        int[] test = new int[]{1, 10, 100, 500, 1000, 5000, 10000};

        int err = 0;

        for (int N : test) {
            int[] A = new int[N];
            int a = 0;
            int b = a + N;

            int c = recurse(A, a, b);

            System.out.println("Test N = " + N);
            System.out.println("# time loop executed = " + c);
            System.out.println("N^2 - N = " + (double)N*(Math.log(N)/Math.log(2)));

            if (c - (N*(Math.log(N)/Math.log(2))) > N/10) {
                System.out.println("Incorrect when test N = " + N);
                err++;
            }
        }

        if (err == 0) {
            System.out.println("\nTest 2 passed\n");
        }
    }

    public static int recurse(int[] A, int a, int b) {
        int c = 0;
        if ( b - a <= 1 ) {
            return 0; // 0 times
        }
        for (int i = a; i < b; i++) {
            c++;
        }
        return c + recurse(A, a, (a+b)/2) + recurse(A, (a+b)/2, b);
    }
}
