
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum += number;
            numbers++;
        }

        double average = (double) sum / numbers;
        System.out.println("Average of the numbers: " + average);
    }
}
