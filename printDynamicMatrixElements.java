import java.util.Scanner;
import java.util.Arrays;
public class printDynamicMatrixElements {
    public static void main(String[] args) {
        printDynamicMatrixElements();
    }
    public static void printDynamicMatrixElements() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("Please enter the number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,%d] = ", row, col);
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println("The matrix is created: " + Arrays.deepToString(matrix));
    }
}

