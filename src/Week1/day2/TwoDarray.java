package Week1.day2;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = sc.nextInt();
        System.out.println("enter number of cols");
        int col = sc.nextInt();

        int[][] array1 = new int[row][col];
        System.out.println("Enter first Array Elements");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                array1[i][j] = sc.nextInt();
            }
        }
        int[][] array2 = new int[row][col];
        System.out.println("Enter second Array Elements");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of arrays ");
        int[][] array3 = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
