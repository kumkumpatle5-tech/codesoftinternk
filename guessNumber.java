import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random any = new Random();
        
        System.out.println("Guess the number (1-100)!");
        
        int number = any.nextInt(100) + 1;
        int attempts = 0;
        int maxattemps = 7;
        
        while (attempts < maxattemps) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == number) {
                System.out.println("Correct! You won in " + attempts + " tries");
                break;
            } else if (guess < number) {
                System.out.println("too low!");
            } else {
                System.out.println("too high!");
            }
            
            System.out.println("attemps left: " + (maxattemps - attempts));
        }
        
        if (attempts == maxattemps) {
            System.out.println("game over  Number was: " + number);
        }
        
        
    }
}

