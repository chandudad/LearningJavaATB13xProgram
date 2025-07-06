package ex_12_While;
import java.util.*;



public class Lab_109_While_Guessing_Number {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        //Random => 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+ 1;
        //System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        while(true){
            System.out.println("Enter another guess");
            guess= scanner.nextInt();
            attempts++;
            if(guess<numberToGuess){
                System.out.println("Too low, try again");
            }
            else if(guess>numberToGuess){
                System.out.println("Too high, try again");
            }
            else{
                System.out.println("Correct! yoy guessed it in" + attempts + "attempts");
            }
        }
    }
}
