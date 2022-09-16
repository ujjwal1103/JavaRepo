package day3;
import java.util.Scanner;
public class CustomExp {
    public static void main(String[] args) throws HeightExp {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height of kid");
        int height = sc.nextInt();
            if(height < 120){
                throw new HeightExp("Not Eligible for roller coaster");
            }else{
                System.out.println("Eligible for roller coaster");
            }
    }
}
