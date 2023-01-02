public class largestNumber {
    public static void main(String[] args) {
        printLargestNumber();
    }
    public static void printLargestNumber() {
        int[] arr = {-2, 19, 28, 0};

        int largestNumber = arr[0];
        int i;

        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber)
                largestNumber = arr[i];
        }

        System.out.println("The largest number is: " + largestNumber);
    }

}
