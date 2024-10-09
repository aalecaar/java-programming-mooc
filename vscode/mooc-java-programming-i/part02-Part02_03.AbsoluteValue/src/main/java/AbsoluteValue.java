
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int absolute = Math.abs(number);
        System.out.println(absolute);
    }
}
