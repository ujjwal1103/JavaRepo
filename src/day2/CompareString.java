package day2;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King" ;
        String str2 =  "stephen edwin king";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1.equals(str2));
    }
}
