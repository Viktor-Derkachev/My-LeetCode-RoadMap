package main.tasks.validParentheses;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class validParenthesesSolution {
    public static void main(String[] args) {
        String example1 = "()[]{}";
        String example2 = "(]";
        String example3 = "([])";
        System.out.println("Output should be: true, actually:" + isValid(example1));
        System.out.println("Output should be: false, actually:" + isValid(example2));
        System.out.println("Output should be: true, actually:" + isValid(example3));

        System.out.println("Output should be: true, actually:" + isValidByDeque(example1));
        System.out.println("Output should be: false, actually:" + isValidByDeque(example2));
        System.out.println("Output should be: true, actually:" + isValidByDeque(example3));

    }

    private static boolean isValid(String s) {
        List<Character> result = new ArrayList<>();
        char[] characters = s.toCharArray();

        for (char character : characters) {
            if (character == '(' || character == '{' || character == '[') {
                result.add(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (result.isEmpty()) {
                    return false;
                }
                char last = result.getLast();
                if (last == '(' && character == ')' || last == '[' && character == ']' || last == '{' && character == '}') {
                    result.removeLast();
                } else {
                    return false;
                }
            }
        }
        return result.isEmpty();
    }

    //second solution by deque

    public static boolean isValidByDeque(String s) {

        Deque<Character> result = new ArrayDeque<>();
        char[] characters = s.toCharArray();

        for (char character : characters) {

            if (character == '(' || character == '{' || character == '[') {
                result.push(character);

            } else if (character == ')' || character == '}' || character == ']') {
                if (result.isEmpty()) {

                    return false;
                }
                char last = result.peek();
                if (last == '(' && character == ')' || last == '[' && character == ']' || last == '{' && character == '}') {
                    result.pop();
                } else {

                    return false;
                }
            }
        }
        return result.isEmpty();
    }
}