
import java.util.Arrays;

public class Test1A
{
    private static String ans1[] = {
            "[(dog1 6.0), (cat1 4.0), (dog2 7.0), (cat2 3.0), (bird1 5.0), (bird2 3.0)]",
            "[(cat1 4.0), (dog1 6.0), (cat2 3.0), (bird1 5.0), (bird2 3.0), (dog2 7.0)]",
            "[(cat1 4.0), (cat2 3.0), (bird1 5.0), (bird2 3.0), (dog1 6.0), (dog2 7.0)]",
            "[(cat1 4.0), (bird1 5.0), (bird2 3.0), (cat2 3.0), (dog1 6.0), (dog2 7.0)]",
            "[(bird1 5.0), (bird2 3.0), (cat1 4.0), (cat2 3.0), (dog1 6.0), (dog2 7.0)]",
            "[(bird1 5.0), (bird2 3.0), (cat1 4.0), (cat2 3.0), (dog1 6.0), (dog2 7.0)]"
    };

    private static String ans2[] = {
            "[(dog1 7.0), (cat1 4.0), (dog2 6.0), (cat2 3.0), (bird1 5.0), (bird2 3.0)]",
            "[(cat1 4.0), (dog2 6.0), (cat2 3.0), (bird1 5.0), (bird2 3.0), (dog1 7.0)]",
            "[(cat1 4.0), (cat2 3.0), (bird1 5.0), (bird2 3.0), (dog2 6.0), (dog1 7.0)]",
            "[(cat2 3.0), (bird1 5.0), (bird2 3.0), (cat1 4.0), (dog2 6.0), (dog1 7.0)]",
            "[(bird1 5.0), (bird2 3.0), (cat2 3.0), (cat1 4.0), (dog2 6.0), (dog1 7.0)]",
            "[(bird2 3.0), (bird1 5.0), (cat2 3.0), (cat1 4.0), (dog2 6.0), (dog1 7.0)]"

    };

    public static void main(String[] args) {
        Animal[] a = new Animal[6];
        int err1, err2;

        a[0] = new Dog("dog1", 6);
        a[1] = new Cat("cat1", 4);
        a[2] = new Dog("dog2", 7);
        a[3] = new Cat("cat2", 3);
        a[4] = new Bird("bird1", 5);
        a[5] = new Bird("bird2", 3);

        System.out.println( Arrays.toString(a) + "\n");
        err1 = BubbleSort.sort(a, ans1);
        System.out.println("\n" + Arrays.toString(a) + "\n");

        if (err1 == 0) {
            System.out.println("\nTest 1A passed\n");
            System.exit(1);
        }

        System.out.println("\n========= Test 1A - run 2\n");
        a[0] = new Dog("dog1", 7);
        a[1] = new Cat("cat1", 4);
        a[2] = new Dog("dog2", 6);
        a[3] = new Cat("cat2", 3);
        a[4] = new Bird("bird1", 5);
        a[5] = new Bird("bird2", 3);

        System.out.println( Arrays.toString(a) + "\n");
        err2 = BubbleSort.sort(a, ans2);
        System.out.println("\n" + Arrays.toString(a) + "\n");

        if (err2 == 0) {
            System.out.println("\nTest 1A passed\n");
        } else {
            System.out.println("\nTest 1A failed\n");
        }
    }
}
