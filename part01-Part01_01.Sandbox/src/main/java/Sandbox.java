import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        try { 
            File file = new File("Ala wabalo.txt");
            System.out.println("Tuara");
            Scanner scanner = new Scanner(file);

            int first = scanner.nextInt();

            System.out.println("FIrst: " + first);



            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File Not Found.");
    


        }
    }
}
