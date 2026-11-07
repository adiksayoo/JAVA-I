
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        System.out.println("How old are you?" + age);

        if (age < 0 || age > 120) {
            System.out.println("impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
