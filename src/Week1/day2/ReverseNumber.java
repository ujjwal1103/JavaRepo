package Week1.day2;

import  java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 2321;
        int reverse = 0;
        while(number != 0){
            int  remainder = number%10;
            reverse = reverse*10 + remainder;
            number =number / 10;
        }
        System.out.println(reverse);
    }
}
