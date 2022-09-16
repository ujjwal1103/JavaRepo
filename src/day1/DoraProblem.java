package day1;

import java.util.*;
public class DoraProblem {
    public static void main(String[] args) {
        //Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular
        // fashion with the order of rows and columns and numbered the trees in row-wise order. She planted the mango tree only
        // in a 1st row, 1st column and last column. So given the tree number, your task is to find whether the given tree is a
        // mango tree or not? Write a program to check whether the given number is a mango tree or not.
        //
        //Input consists of 3 integers
        //The first input denotes the number of rows
        //The second input denotes the number of columns
        //The third input denotes the tree number, which you have to find whether it's a mango tree or not.
        Scanner sc = new Scanner(System.in);
        int row,column,treeNumber;
        row = sc.nextInt();
        column = sc.nextInt();
        treeNumber = sc.nextInt();

        if(treeNumber <= row || treeNumber <=column || treeNumber % column == 0 || treeNumber % column == 1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
