package Week1.day1;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("The Greater Number is "+num1);
        }else {
            System.out.println("The Greter Number is "+num2);
        }
    }
}
