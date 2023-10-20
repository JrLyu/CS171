import java.util.Stack;
import java.util.ArrayList;

public class InfixToPostfix {
    public static ArrayList<String> convertToPostfix(String[] inp) {
        ArrayList<String> result = new ArrayList<>();
        Stack<String> operatorStck = new Stack<>();
        String s;
        for (int i = 0; i < inp.length; i++) {
            s = inp[i];
            if (s.equals("+") || s.equals("-")) { // If s is an operator
                if (!operatorStck.isEmpty()) {
                    if (operatorStck.peek().equals("+") || operatorStck.peek().equals("-")) {
                        result.add(operatorStck.pop());
                    }
                }
                operatorStck.push(s);
            } else if (s.equals("(")) {
                operatorStck.push(s);
            } else if (s.equals(")")) {
                while (!operatorStck.peek().equals("(")) {
                    result.add(operatorStck.pop());
                }
                operatorStck.pop();
            } else {
                // If s is a number
                result.add(s);
            }
        }
        // When the input is exhusted, pop out all the operators reamined in the stack
        while (!operatorStck.isEmpty()) {
            if (!operatorStck.peek().equals("(")) {
                result.add(operatorStck.pop());
            } else {
                operatorStck.pop();
            }
        }
        return result;
    }
}