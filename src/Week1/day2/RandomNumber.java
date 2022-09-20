package Week1.day2;

import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        int answer, guess;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer = rand.nextInt(10) + 1;
         do{
            System.out.println("Guess a number between 1 and 100: ");
            guess = in.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again");
            }
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }
            else {
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }
        }while(!correct);
    }
}
