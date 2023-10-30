// Test if the array raps around correctly
public class HW7Test3 {
    public static void main(String[] args) {
        DEQueue<Integer> q = new CircularBuffer<>(6);
        String[][]  ans1 = { {" 1", " 1 2", " 1 2 3"},
                             {" 4", " 4 5", " 4 5 6"},
                             {" 7", " 7 8", " 7 8 9"},
                             {" 10", " 10 11", " 10 11 12"},
                             {" 13", " 13 14", " 13 14 15"}
                            };
        String[][]  ans2 = { {" 2 3", " 3", ""},
                             {" 5 6", " 6", ""},
                             {" 8 9", " 9", ""},
                             {" 11 12", " 12", ""},
                             {" 14 15", " 15", ""}
                            };
        String    out = null;
        int       err = 0;

        // Test Queue
        int i = 0, j = 0, x = 0;

        for (int k = 0; k < 5; k++) {
            // ************************************* Add last
            q.addLast(++i);
            System.out.print("Student = " + q);
            if (!q.toString().equals(ans1[k][0])) {
                System.out.println(" (** Wrong) - Correct = " + ans1[k][0]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            q.addLast(++i);
            System.out.print("Student = " + q);
            if (!q.toString().equals(ans1[k][1])) {
                System.out.println(" (** Wrong) - Correct = " + ans1[k][1]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            q.addLast(++i);
            System.out.print("Student = " + q);
            if (!q.toString().equals(ans1[k][2])) {
                System.out.println(" (** Wrong) - Correct = " + ans1[k][2]);
                err++;
            } else {
                System.out.println(" -- correct");
            }

            // ************************************* Remove first
            if ((x = q.removeFirst()) != ++j) {
                System.out.println("**** q.removeFirst() returns " + x);
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

            if ((x = q.removeFirst()) != ++j) {
                System.out.println("**** q.removeFirst() returns " + x);
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

            if ((x = q.removeFirst()) != ++j) {
                System.out.println("**** q.removeFirst() returns " + x);
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
            System.out.println("\nTest 3 passed");
        } else {
            System.out.println("\nTest 3 failed");
        }
    }
}