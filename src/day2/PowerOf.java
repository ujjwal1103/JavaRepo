package day2;

public class PowerOf {
    public static void main(String[] args) {
        int num1 = 2;
        int power = 4;
        int result = 1;
        for(int i = 1;i<=power;i++){
            result *= num1;
        }
        System.out.println(result);
    }
}
