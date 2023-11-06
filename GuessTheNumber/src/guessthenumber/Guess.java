package guessthenumber;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 10;

        System.out.println("I chose a number between 1 and 100. Try to guess it!");

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt #" + i + ": Enter a number:");
            int guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("The secret number is higher. You still have " + (attempts - i) + " attempts.");
            } else if (guess > secretNumber) {
                System.out.println("The secret number is lower. You still have " + (attempts - i) + " attempts.");
            } else {
                System.out.println("Congratulations! You guessed the secret number (" + secretNumber + ") in " + i + " attempts.");
                break;
            }

            if (i == attempts) {
                System.out.println("You have exhausted all attempts. The secret number was: " + secretNumber);
            }
        }

        scanner.close();
    }
}

