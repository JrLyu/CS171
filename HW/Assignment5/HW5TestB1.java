// Test the Trap class
public class HW5TestB1 {
    public static void main(String[] args) {
        int err = 0 ;

        Trap<Animal> t1 = new AnimalTrap<>();  // **** Make this work !!!

        Mouse m1 = new Mouse("mouse1", "peep", 1);
        Mouse b1 = new Mouse("bear1", "roar", 1);

        System.out.println("Testing Trap that traps Animal objects..\n");

        // ****** Test initial snare
        if (t1.snare(m1)) {
            System.out.println("m1 snared - correct");
        } else {
            err++;
            System.out.println("m1 snared FAILED - ERROR");
        }

        // ****** Test snare while trap sprung
        if (t1.snare(b1)) {
            err++;
            System.out.println("b1 snared while trap is used - ERROR");
        } else {
            System.out.println("b1 not snared - correct");
        }

        // ****** Test release
        Animal x;
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
        if (t1.snare(b1)) {
            System.out.println("b1 snared - correct");
        } else {
            err++;
            System.out.println("b1 snared FAILED - release did not reset trap - ERROR");
        }

        // ****** Test snare while trap sprung
        if (t1.snare(m1)) {
            err++;
            System.out.println("m1 snared while trap is used - ERROR");
        } else {
            System.out.println("m1 not snared - correct");
        }

        // ****** Test release again
        ans = "bear1 - roar";

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
            System.out.println("\nTest B1 passed\n");
        }
    }
}