
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String userPassword = scan.nextLine();
        String correctPassword = "Caput Draconis";
        if (userPassword.equals(correctPassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
