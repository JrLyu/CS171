// Test the Trap class
public class HW5TestA1 {
    public static void main(String[] args) {
        int err = 0 ;

        Trap<Mouse> t1 = new Trap<>();

        Mouse m1 = new Mouse("mouse1", "peep", 1);
        Mouse m2 = new Mouse("mouse2", "peep", 1);

        System.out.println("Testing Trap that traps mouse objects..\n");

        // ****** Test initial snare
        if (t1.snare(m1)) {
            System.out.println("m1 snared - correct");
        } else {
            err++;
            System.out.println("m1 snared FAILED - ERROR");
        }

        // ****** Test snare while trap sprung
        if (t1.snare(m2)) {
            err++;
            System.out.println("m2 snared while trap is used - ERROR");
        } else {
            System.out.println("m2 not snared - correct");
        }

        // ****** Test release
        Mouse x;
        String ans = "mouse1 - peep";

        x = t1.release();

        if (x == null) {
            err++;
            System.out.println("t1.release() returned null - ERROR");
        } else {
            System.out.println(x);
            if (x.toString().compareTo(ans) != 0) {
                System.out.println("t1.release() wrong output - ERROR");
                System.out.println("Student: " + x.toString());
                System.out.println("Correct: " + ans);
            }
        }

        // ****** Test snare after release
        if (t1.snare(m2)) {
            System.out.println("m2 snared - correct");
        } else {
            err++;
            System.out.println("m2 snared FAILED - release did not reset trap - ERROR");
        }

        // ****** Test snare while trap sprung
        if (t1.snare(m1)) {
            err++;
            System.out.println("m1 snared while trap is used - ERROR");
        } else {
            System.out.println("m1 not snared - correct");
        }

        // ****** Test release again
        ans = "mouse2 - peep";

        x = t1.release();

        if (x == null) {
            err++;
            System.out.println("t1.release() returned null - ERROR");
        } else {
            System.out.println(x);
            if (x.toString().compareTo(ans) != 0) {
                System.out.println("t1.release() wrong output - ERROR");
                System.out.println("Student: " + x.toString());
                System.out.println("Correct: " + ans);
            }
        }

        if (err == 0) {
            System.out.println("\nTest A1 passed\n");
        }
    }
}