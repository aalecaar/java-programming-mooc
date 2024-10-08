
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        int speedLimit = 120;
        if (speed > speedLimit) {
            System.out.println("Speeding ticket!");
        }
    }
}