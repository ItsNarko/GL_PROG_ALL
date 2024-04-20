import java.util.Scanner;

public class HiLowGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            playHiLow(); // Call the method containing the game logic
            System.out.print("Play again? (yes/no): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("yes");
        } while (playAgain);

        scanner.close();
    }

    public static void playHiLow() {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numTries = 0;
        int guess;

        System.out.println("Welcome to the Hi-Low game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed it in " + numTries + " tries.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}
