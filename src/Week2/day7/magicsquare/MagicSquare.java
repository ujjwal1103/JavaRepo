package Week2.day7.magicsquare;

public class MagicSquare {
    private static boolean isMagicSquare(int[][] arr, int row) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<row;j++){
                if(i == j){
                    diagonal1 += arr[i][j];
                }
                if((i+j)==(row-1)) diagonal2 += arr[i][j];
            }

            if(diagonal2 != diagonal1){
                return false;
            }

            for(int j = 0;j<row;j++){
                int rowSum = 0;
                int colSum = 0;
                for(int k = 0;k<row;k++){
                    rowSum += arr[j][k];
                    colSum += arr[k][j];
                }

                if(rowSum != colSum || colSum!= diagonal1){
                    return false;
                }
            }
        }
         return true;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = row;

        int[][] arr = {{2,7,6},{9,5,1},{4,3,8}};
        //2 3
        //3 4

        boolean result = isMagicSquare(arr,row);
        System.out.println(result);
    }


}
