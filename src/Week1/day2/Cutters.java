package Week1.day2;

import java.util.*;
public class Cutters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Cutters");
        int numberOfCutters = sc.nextInt();
        String[] cutters = new String[numberOfCutters];
        System.out.println("Enter Name of Cutters");
        for(int i = 0;i < numberOfCutters;i++){
            cutters[i] = sc.next();
        }

        for(String cutter:cutters){
            System.out.println(cutter + " ");
        }
    }
}
