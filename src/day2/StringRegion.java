package day2;

import java.util.*;
public class StringRegion {
    public StringRegion() {


    }



    public static void main(String[] args) {
        String str1;
        String str2 ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first string");
        str1 = sc.nextLine();
        System.out.println("Enter second String");
        str2 = sc.nextLine();
        int beginning= 0,end = 0;
        for(int i = 0; i<2;i++){
            System.out.println("Enter start index");
            beginning = sc.nextInt();
            System.out.println("Enter end index");
            end = sc.nextInt();
        }
        boolean result = str1.substring(beginning,end).equals(str2.substring(beginning,end));
        String subStr1 = str1.substring(beginning,end);
        String subStr2 = str2.substring(beginning,end);
        System.out.println(result);
        System.out.println(subStr1);
        System.out.println(subStr2);
    }


}
