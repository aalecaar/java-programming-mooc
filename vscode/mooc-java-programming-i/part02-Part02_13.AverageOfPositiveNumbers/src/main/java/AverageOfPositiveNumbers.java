
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumsCount = 0;
        int positiveNumsSum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveNumsCount += 1;
                positiveNumsSum += number;
            }
        }
        
        double average = (double) positiveNumsSum / positiveNumsCount;

        if (positiveNumsCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }



    }
}
