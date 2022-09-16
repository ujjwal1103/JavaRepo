package day1;

import java.util.Scanner;
public class SwitchCaseProgram {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        num2 = sc.nextInt();
        System.out.println("Enter Operater");
        char op = sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:System.out.println("Invalid Operater!");
        }
    }
}
