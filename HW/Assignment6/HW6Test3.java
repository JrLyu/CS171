import java.util.ArrayList;
import java.util.Arrays;

public class HW6Test3 {
    public static void main(String[] args) {
        ArrayList<String> s;
        String[][] input = {
                            { "(", "3", "+", "4" ,")"},
                            { "(", "3", "-", "4" ,")"},
                           };

        String[] ans = { "[3, 4, +]",
                         "[3, 4, -]"  };

        int err = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.println("Input   = " + Arrays.toString(input[i]));
            s = InfixToPostfix.convertToPostfix(input[i]);
            System.out.println("Output  = " + s + "\n");

            if (!s.toString().equals(ans[i])) {
                err++;
                System.out.println("Wrong, correct answer = " + ans[i]);
            }
        }

        if (err == 0) {
            System.out.println("Test 3 passed");
        }
    }
}