
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,6);

    }

    public static void divisibleByThreeInRange(int numerator,int denominator) {
        int i = numerator;
        while (i <= denominator){
            if (i % 3 == 0 ) {
                System.out.println(i);
            }

            i++;
        }
    }
}
