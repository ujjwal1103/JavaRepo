package Week2.day8.candleproblem;

import java.util.ArrayList;
import java.util.Collections;

public class Candles2 {
    public static int BirthdayCakeCandles(int [] candles,int n) {
        ArrayList<Integer> candles2= new ArrayList<>();
        for(int i: candles){
            candles2.add(i);
        }
        int tallestCandle = Collections.max(candles2);
        return Collections.frequency(candles2,tallestCandle);


    }
    public static void main(String[] args) {
        int n = 4;
        int []candles = {3,2,1,3};
        System.out.println(BirthdayCakeCandles(candles,n));

    }
}
