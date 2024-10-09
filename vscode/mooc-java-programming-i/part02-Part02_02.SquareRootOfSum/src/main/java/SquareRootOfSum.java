
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        double squaredRoot = Math.sqrt(sum);
        System.out.println(squaredRoot);
    }
}
