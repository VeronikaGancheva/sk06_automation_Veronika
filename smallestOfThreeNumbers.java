class smallestOfThreeNumbers {

    public static void main(String[] args) {
        System.out.println(findSmallestNumber( 0.8, 1.1, 5.1));
    }
    public static double findSmallestNumber(double num1, double num2, double num3) {
        double smallestNumber = num1;

        if (smallestNumber > num2) {
            smallestNumber = num2;
        }

        if (smallestNumber > num3) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }
}