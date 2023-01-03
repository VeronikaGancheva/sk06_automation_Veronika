public class printBiggestNum {
    public static void main(String[] args) {
        printBiggestNum();
    }
    public static void printBiggestNum() {
        int[] numbers = {20, 32, 80, 82, 43};

        int biggestNum = numbers[0];

        // Traverse array elements from second and compare every element with current biggest number
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > biggestNum)
                biggestNum = numbers[i];

        System.out.println("The biggest number is: " + biggestNum);
    }
}
