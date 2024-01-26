// Task 3: Create a class Game, which allows a user to play "Guess the number" game.

import java.util.*;

class Game {
    private int lower;
    private int upper;
    private int randomNumber;
    private int numberOfGuesses;

    public Game(int lowerLimit, int upperLimit) {
        lower = lowerLimit;
        upper = upperLimit;
        randomNumber = RandomNumber();
        numberOfGuesses = 0;
    }

    public int RandomNumber() {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower;
    }

    public boolean tryGuess(int userGuess) {
        numberOfGuesses++;

        if (userGuess < lower || userGuess > upper) {
            System.out.println("Please enter a number between " + lower + " and " + upper + ".");
            return false;
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! Try again.");
            return false;
        } else if (userGuess > randomNumber) {
            System.out.println("Too high! Try again.");
            return false;
        } else {
            System.out.println("Yeah! You guessed it right!!");
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scer = new Scanner(System.in);
        System.out.println("Welcome to the Guess the Number game!");

        // Set the desired range for the random number
        int lowerLimit = 1;
        int upperLimit = 100;

        Game game = new Game(lowerLimit, upperLimit);
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scer.nextInt();

            if (game.tryGuess(userGuess)) {
                break; // Exit the loop if the guess is correct
            }
        }
    }
}
