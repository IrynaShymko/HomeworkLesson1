import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeworkPart2Task2 {

    public static void main(String[] args) {

        System.out.println("Hello, please type an integer > 0 as a size of array and press 'Enter' button");
        Scanner scanner1 = new Scanner(System.in);
        try {
            int size = scanner1.nextInt();
            if (size <= 0) {
                System.out.println("Integer should be > 0.");
            } else {
                int[] numbers = new int[size];

                for (int i = 0; i < size; i++) {
                    System.out.println("Type a number please");
                    numbers[i] = scanner1.nextInt();
                }

                double averageValue = Arrays.stream(numbers).average().getAsDouble();
                int maxValue = Arrays.stream(numbers).max().getAsInt();

                System.out.println("Average is " + averageValue);
                System.out.println("Max value is " + maxValue);
            }

        } catch (InputMismatchException e) {
            System.out.println("It is bad value. Allowed integers > 0 only.");
            System.out.println("The program needs to be started again.");
            System.out.println("The program needs to be started again.");
        }
    }
}