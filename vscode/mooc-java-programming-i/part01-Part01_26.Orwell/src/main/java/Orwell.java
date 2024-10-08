
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        int orwellNumber = 1984;
        if (number == orwellNumber) {
            System.out.println("Orwell!");
        }
    }
}
