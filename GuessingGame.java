import java.util.Scanner;
import java.util.Random;

public class GuessingGame  {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != randomNumber) {
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too Low!! Try again:");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high!! Try again:");
            }
            else {
                System.out.println("Your Guess is Right");
            }
        }
        
    }
}