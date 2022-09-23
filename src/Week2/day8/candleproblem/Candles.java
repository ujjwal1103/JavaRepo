package Week2.day8.candleproblem;


        /*You are in charge of the cake for a child's birthday.
        You have decided the cake will have one candle for each year of their total age.
        They will only be able to blow out the tallest of the candles.
        Count how many candles are tallest.

        Example
        Candles = [4,4,1,3]
        The maximum height of candles is 4 units high. There are 2 of them, so return 2.

        Function Description
        Method birthdayCakeCandles() has the following parameter(s):
        •	int candles[n]: the candle heights
        Returns
        •	int: the number of candles that are tallest

        Input Format
        The first line contains a single integer, n, the size of candles[].
        The second line contains n space-separated integers, where each integer I describes the height of candles[i].

        Sample Input 0
        4
        3 2 1 3
        Sample Output 0
        2

        Explanation 0
        Candle heights are [3,2,1,3]. The tallest candles are 3 units, and there are 2 of them.*/

public class Candles {

    public  static  int birthdayCakeCandles(int [] candles,int n){
        int tallestCandleCount = 0;
        int tallestCandle = candles[0];
        //finding the tallest candle
        for(int i = 0;i<n;i++){
            if(candles[i] > candles[0]){
                tallestCandle = candles[i];
            }
        }
        //finding total tallest candles
        for(int i = 0;i<n;i++){
            if(tallestCandle == candles[i]){
                tallestCandleCount++;
            }
        }
        return tallestCandleCount;
    }


    public static void main(String[] args) {

        int n = 4;
        int [] candles = {3,2,3,1};

        int tallestCandleCount = birthdayCakeCandles(candles,n);
        System.out.println("Total tallest candles are "+ tallestCandleCount);
    }
}
