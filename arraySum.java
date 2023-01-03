import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class arraySum {

    public static void main(String[] args) {
        printArraySum();
    }
    public static void printArraySum() {
        double[] numbers = {0, 0.5, 1, 1.5, 2, 2.5};
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
