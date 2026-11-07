
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int i = 1;
        while (number >= i) {
            System.out.println(i);
            i++;
        }
    }
}
