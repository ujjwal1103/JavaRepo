package javaassessment.problem2;

public class ChangeMaker {


    public static void main(String[] args) {
        int coins[]  = {1,2,5};
        int purchaseAmount = 30;
        int tenderAmount = 40;

        VendingMachine machine = new VendingMachine(coins);
        int change = machine.CalculateChange(purchaseAmount,tenderAmount);

        int []arr = machine.MinimumCoinsRequired(change);

        for(int ele:arr){
            System.out.println(ele);
        }




    }
}
