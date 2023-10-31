// Test if the array raps around correctly
public class HW6_5Test4 {
    public static void main(String[] args) {
        DEQueue<Integer> q = new CircularBuffer<>(6);
        String[][]  ans1 = { {" 1", " 2 1", " 3 2 1"},
                             {" 4", " 5 4", " 6 5 4"},
                             {" 7", " 8 7", " 9 8 7"},
                             {" 10", " 11 10", " 12 11 10"},
                             {" 13", " 14 13", " 15 14 13"}
                            };
        String[][]  ans2 = { {" 3 2", " 3", ""},
                             {" 6 5", " 6", ""},
                             {" 9 8", " 9", ""},
                             {" 12 11", " 12", ""},
                             {" 15 14", " 15", ""}
                            };
        String    out = null;
        int       err = 0;

        // Test Queue
        int i = 0, j = 0, x = 0;

        for (int k = 0; k < 5; k++) {
            // ************************************* Add last
            q.addFirst(++i);
            System.out.print("Student = " + q);
            if (!q.toString().equals(ans1[k][0])) {
                System.out.println(" (** Wrong) - Correct = " + ans1[k][0]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            q.addFirst(++i);
            System.out.print("Student = " + q);
            if (!q.toString().equals(ans1[k][1])) {
                System.out.println(" (** Wrong) - Correct = " + ans1[k][1]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            q.addFirst(++i);
            System.out.print("Student = " + q);
            if (!q.toString().equals(ans1[k][2])) {
                System.out.println(" (** Wrong) - Correct = " + ans1[k][2]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            // ************************************* Remove first
            if ((x = q.removeLast()) != ++j) {
                System.out.println("**** q.removeLast() returns " + x);
                System.out.println("**** Correct value = " + (j-1));
                err++;
            }

            System.out.print("Student = " + q);
            if (!q.toString().equals(ans2[k][0])) {
                System.out.println(" (** Wrong) - Correct = " + ans2[k][0]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            if ((x = q.removeLast()) != ++j) {
                System.out.println("**** q.removeLast() returns " + x);
                System.out.println("**** Correct value = " + (j-1));
                err++;
            }

            System.out.print("Student = " + q);
            if (!q.toString().equals(ans2[k][1])) {
                System.out.println(" (** Wrong) - Correct = " + ans2[k][1]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            if ((x = q.removeLast()) != ++j) {
                System.out.println("**** q.removeLast() returns " + x);
                System.out.println("**** Correct value = " + (j-1));
                err++;
            }

            System.out.print("Student = " + q);
            if (!q.toString().equals(ans2[k][2])) {
                System.out.println(" (** Wrong) - Correct = " + ans2[k][2]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            System.out.println("--------------------- Next series");
        }


        if (err == 0) {
            System.out.println("\nTest 4 passed");
        } else {
            System.out.println("\nTest 4 failed");
        }
    }
}