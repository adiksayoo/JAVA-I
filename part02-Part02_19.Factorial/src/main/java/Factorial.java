
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = 1;

        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= input; i++ ) {
            f *= i;
        }
        System.out.println("Factorial: " + f);
    }
}
