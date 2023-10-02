//// Test the Trap class
//public class HW5TestC2 {
//    public static void main(String[] args) {
//        int err = 0 ;
//
//        Trap<Object> t1 = new AnimalTrap<>(); // **** Correct if you see a compile error
//
//        Mouse m = new Mouse("mouse1", "peep", 1);
//        Bear b  = new Bear("bear1", "roar", 1);
//        Car c   = new Car("car1", "froom", 1);
//
//        System.out.println("Testing Trap that can trap any object..\n");
//
//        // ****** Test initial snare
//        if (t1.snare(m)) {
//            System.out.println("m snared - correct");
//        } else {
//            err++;
//            System.out.println("m snared FAILED - ERROR");
//        }
//
//        // ****** Test snare while trap sprung
//        if (t1.snare(b)) {
//            err++;
//            System.out.println("b snared while trap is used - ERROR");
//        } else {
//            System.out.println("b not snared - correct");
//        }
//
//        // ****** Test release
//        Object x;
//        String ans = "mouse1 - peep";
//
//        x = t1.release();
//
//        if (x == null) {
//            err++;
//            System.out.println("t1.release() returned null - ERROR");
//        } else {
//            System.out.println(x);
//            if (x.toString().compareTo(ans) != 0) {
//                System.out.println("t1.release() wrong output - ERROR");
//                System.out.println("Student: " + x.toString());
//                System.out.println("Correct: " + ans);
//            }
//        }
//
//        // ****** Test snare after release
//        if (t1.snare(c)) {
//            System.out.println("c snared - correct");
//        } else {
//            err++;
//            System.out.println("c snared FAILED - release did not reset trap - ERROR");
//        }
//
//        // ****** Test snare while trap sprung
//        if (t1.snare(m)) {
//            err++;
//            System.out.println("m snared while trap is used - ERROR");
//        } else {
//            System.out.println("m not snared - correct");
//        }
//
//        // ****** Test release again
//        ans = "car1 - froom";
//
//        x = t1.release();
//
//        if (x == null) {
//            err++;
//            System.out.println("t1.release() returned null - ERROR");
//        } else {
//            System.out.println(x);
//            if (x.toString().compareTo(ans) != 0) {
//                System.out.println("t1.release() wrong output - ERROR");
//                System.out.println("Student: " + x.toString());
//                System.out.println("Correct: " + ans);
//            }
//        }
//
//        if (err == 0) {
//            System.out.println("\nTest C2 passed\n");
//        }
//    }
//}