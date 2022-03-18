import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class HomeworkPart2Task1 {
    static int maxCountOfAttempts = 5;

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        showHelloText();
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < maxCountOfAttempts; i++) {
            try {
                int guessedNumberByUser = scanner1.nextInt();
                if (guessedNumberByUser == numberToGuess) {
                    System.out.println("You guessed it!");
                    break;}

               if (guessedNumberByUser > numberToGuess) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                } else {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                }

                if (i == maxCountOfAttempts-1) {
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    break;
                }else{
                System.out.println("You have " + (maxCountOfAttempts-i-1) + " attempts");
                System.out.println("Please try again");}

            } catch (InputMismatchException e) {
                System.out.println("It is bad value. Allowed values 0-99.");
                System.out.println("The program needs to be started again.");
                break;
            }
        }
    }
    static void showHelloText() {
        System.out.println("Hello, the number is chosen by program.");
        System.out.println("You have " + maxCountOfAttempts + " attempts to guess the number.");
        System.out.println("Let's start. Please, type an integer in the range [0-99] and press 'Enter' button.");
    }
}
