package Week2.day8.countnsay;

public class CountAndSay {
    public static void main(String[] args) {
      int n = 5;
     String result = countAndSay(n);
        System.out.println(result);

    }
    private static String countAndSay(int n) {
     String say =  "1";
     for(int i = 0;i<n-1;i++){
         char c = say.charAt(0);
         String s = "";
         int count = 1;
          for(int j = 1;j<say.length();j++){
              if(c != say.charAt(j)){
                  s +=  Integer.toString(count) + c;
                  count = 0;
                  c = say.charAt(j);
              }
              count++;
          }
          s += Integer.toString(count) + c;
         say = s;
     }
        return say;
    }
}
