// Test implementation of interfaces
import java.util.Arrays;
public class HW5Test3 {
    public static void main(String[] args) {
        int err = 0 ;

        MyComparable[] list = new MyComparable[4];

        list[0] = new Mouse("mouse1(1)", "peep", 1);
        list[1] = new Bear("bear1(4)", "roar", 40);
        list[2] = new Bear("bear2(3)", "peep", 30);
        list[3] = new Mouse("mouse2(2)", "peep", 2);

        System.out.println(Arrays.toString(list));

        try {
            InsertionSort.sort(list);
        } catch (ClassCastException e) {
            System.out.println(e + "\n");
            System.out.println("**** This error occurred because your isLessThan() method");
            System.out.println("**** was trying to cast a Bear to a Mouse or vice versa...");
            System.out.println("**** Hint on how to fix it:");
            System.out.println("  In isLessThan(): use a different class to cast the reference variables\n");
            System.out.println("  I'll let you figure out which class to use...\n\n");
        }

        System.out.println(Arrays.toString(list));

        String ans = "[mouse1(1) - peep, mouse2(2) - peep, bear2(3) - peep, bear1(4) - roar]";

        if (Arrays.toString(list).equals(ans)) {
            System.out.println("\nTest 3 passed\n");
        }
    }
}