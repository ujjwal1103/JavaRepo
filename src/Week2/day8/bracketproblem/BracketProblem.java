package Week2.day8.bracketproblem;



import java.util.*;

public class BracketProblem {
    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();//{}()
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);

            } else if (ch == '}') if (stack.peek() != '{') {
                return false;
            } else {
                stack.pop();

            }
            else if (ch == ']') {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();

                }
            } else if (ch == ')') {
                if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check");

        String str = sc.nextLine();
        System.out.println(isBalanced(str));



    }
}
