import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.print("----------------------------------------------------\n");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("----------------------------------------------------\n");
        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            int lowerBound = 1;
            int upperBound = 100;

            System.out.println("Choose a number between 1-100. ");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (" + lowerBound + " - " + upperBound + "): ");
                int userGuess = scanner.nextInt();
                System.out.print("----------------------------------------------------\n");
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println(" you guessed the number " + targetNumber);
                    score++;
                    System.out.print("----------------------------------------------------\n");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("low");
                    lowerBound = Math.max(lowerBound, userGuess + 1);
                    System.out.print("----------------------------------------------------\n");
                } else {
                    System.out.println("high");
                    upperBound = Math.min(upperBound, userGuess - 1);
                    System.out.print("----------------------------------------------------\n");
                }

                if (attempts == maxAttempts) {
                    System.out.println("No more attempts left");
                    System.out.print("----------------------------------------------------\n");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            System.out.print("----------------------------------------------------\n");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);
        System.out.print("----------------------------------------------------\n");
    }
}
