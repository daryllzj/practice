package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        boolean result =isValid("{[]}");

        System.out.println(result);
    }

    public static boolean isValid(String s) {

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= s.length() -1; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if (!stack.isEmpty() && brackets.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }

}
