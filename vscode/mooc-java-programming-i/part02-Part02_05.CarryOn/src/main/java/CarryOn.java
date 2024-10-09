
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Should we carry on? Type yes or no");
            String answer = scanner.nextLine();
            
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        
    }
}
