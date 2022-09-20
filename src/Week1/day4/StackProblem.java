package Week1.day4;
/*
          A string containing only parentheses is balanced if the following is true:
           1. if it is an empty string
           2. if A and B are correct, AB is correct,
          3. if A is correct, (A) and {A} and [A] are also correct.

        Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

        Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
        Given a string, determine if it is balanced or not.

        Input Format
        There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
        The part of the code that handles input operation is already provided in the editor.

        Output Format
        For each case, print 'true' if the string is balanced, 'false' otherwise.
        Sample Input
        {}()
        ({()})
        {}(
        []
        Sample Output
        true
        true
        false
        true
*/


import java.util.*;


public class StackProblem {

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
        try{
            return stack.isEmpty();

        }catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");

        System.out.println(isBalanced(sc.nextLine()));

        }
    }




