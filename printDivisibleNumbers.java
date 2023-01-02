public class printDivisibleNumbers {
    public static void main(String[] args) {
        DivisibleNumbers();
    }
    public static void DivisibleNumbers() {

        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int num;

        for (int j : list) {
            num = j;
            if ((num % 5) == 0) {
                System.out.println(num);
                if (num > 150) {
                    break;
                }
            }
        }
    }
}