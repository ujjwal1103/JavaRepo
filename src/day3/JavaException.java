package day3;
public class JavaException {
    public static void main(String[] args) {
        int num1 = 10;
        String s = null;
        int num2;
        num2 = s.length();
        int div = 0;
        try{
           div = num1/num2;
           System.out.println(div);
        }catch (ArithmeticException exp){
            System.out.println(exp.getMessage());
        }catch(NullPointerException exp){
            System.out.println(exp.getMessage());
        }
    }
}
