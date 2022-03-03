import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeworkPart2Task1 {
    static int maxCountOfAttempts = 5;
    static int attemptsCounter = maxCountOfAttempts;

    static void checkAttemptsCount() {
        if (attemptsCounter > 1) {
            System.out.println("You have " + attemptsCounter + " attempts");
            System.out.println("Please try again");
        } else if (attemptsCounter == 1) {
            System.out.println("You have " + attemptsCounter + " attempt");
            System.out.println("Please try again");
        }
    }

    static void showHelloText() {
        System.out.println("Hello, the number is chosen by program.");
        System.out.println("You have " + maxCountOfAttempts + " attempts to guess the number.");
        System.out.println("Let's start. Please, type an integer in the range [0-99] and press 'Enter' button.");
    }


    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);

        showHelloText();

        Scanner scanner1 = new Scanner(System.in);


        for (int i = 0; i < maxCountOfAttempts; i++) {
            try {
                int guessedNumberByUser = scanner1.nextInt();
                if (guessedNumberByUser == numberToGuess) {
                    System.out.println("You guessed it!");
                    break;
                } else if (0 <= guessedNumberByUser && guessedNumberByUser < 100 && guessedNumberByUser != numberToGuess) {
                    attemptsCounter -= 1;
                    checkAttemptsCount();
                    if (attemptsCounter == 0) {
                        System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    }
                } else if (guessedNumberByUser > 99) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                    attemptsCounter -= 1;
                    checkAttemptsCount();
                    if (attemptsCounter == 0) {
                        System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    }

                } else if (guessedNumberByUser < 0) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                    attemptsCounter -= 1;
                    checkAttemptsCount();
                    if (attemptsCounter == 0) {
                        System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("It is bad value. Allowed values 0-99.");
                System.out.println("The program needs to be started again.");
                break;
            }
        }
    }
}
