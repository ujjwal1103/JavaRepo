package javaassessment.problem2;

import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachine {
    int[] coins;

    public VendingMachine(int[] coins) {
        this.coins = coins;
    }

    int CalculateChange(int purchaseAmount, int tenderAmount){
        int change = tenderAmount - purchaseAmount;
        return change;
    }

    int[] MinimumCoinsRequired(int change){

      return coins;
    }

}
