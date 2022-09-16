package day2;

import java.util.Scanner;

public class EvenRange {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i = 1;i<number;i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int [] numbers = new int[number];
        for(int i = 0;i<number;i++){
            numbers[i] = i+1;
        }
        System.out.println("enhanced for loop");
        for(int i:numbers){
            if(i%2 == 0)
            System.out.print(i + " ");
        }
    }
}
