import java.util.Stack;

public class Problem04 {

    public static boolean isValidExpression(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '*' || c == '/') {
                if (i == 0 || i == s.length() - 1 || s.charAt(i - 1) == '*' || s.charAt(i - 1) == '/' || s.charAt(i + 1) == '*' || s.charAt(i + 1) == '/') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = args[0];
        System.out.println(isValidExpression(expression));
    }
}

