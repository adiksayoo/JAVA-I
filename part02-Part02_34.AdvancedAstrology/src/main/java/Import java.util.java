Import java.util.Scanner;

public class FirstProject {

    public static void main{String[] args} {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input =< 0) {

                system.out.println("failed");

                continue;

            } else if (input == 10) {

                system.out.println("Umazing");

                break;

            } else if (input >= 7) {

                system.out.println("passed ig);")

                continue;

            } else if (input <= 6) {

                system.out.println("ok ig");

            } else { 
                
                system.out.println("Ginoo nay kabalo");

                continue;
                
            }
        }
    }
}
