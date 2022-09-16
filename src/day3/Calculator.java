package day3;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        char operator = sc.next().charAt(0);

        try{
            if(operator == '+'){
                System.out.println(num1+num2);
            }else if(operator == '-'){
                System.out.println(num1-num2);
            }else if(operator == '*'){
                System.out.println(num1*num2);
            }else if(operator == '/'){
                System.out.println(num1/num2);
            }
            else{
                System.out.println("invalid operator");
            }
        }catch(ArithmeticException exp){
            System.out.println(exp.getMessage() + " cannot divide by zero");
        }catch(NullPointerException exp){
            System.out.println(exp.getMessage());
        }
    }
}
