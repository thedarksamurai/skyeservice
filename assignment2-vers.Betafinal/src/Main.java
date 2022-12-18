import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int computerInput = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        int useGuess = 0;

        while (useGuess < 5){
            System.out.println("Choose a number between 1 and 100.");

            int userResponse = scanner.nextInt();

            if (userResponse < 1 || userResponse > 100){
                System.out.println("Your guess was invalid. Due not being between parameters please try again.");
            } else if (userResponse < computerInput) {
                System.out.println("Higher number");
                useGuess++;
            } else if (userResponse > computerInput) {
                System.out.println("Lower Number");
                useGuess++;
            } else {
                gameOver = true;
                break;
            }
        }
        if (gameOver){
            System.out.println("Yay you win.");
        } else {
            System.out.println("Game Over");
            System.out.println("The number was " + computerInput);
        }
        scanner.close();
    }
}