import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }
        public static boolean isPalindrome() {
            int remainder;
            int sum = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number ");

            int num = scanner.nextInt();

            if (num >= 0) {
                int palindrome = num;

                while (palindrome > 0) {
                    remainder = palindrome % 10;
                    sum = (sum * 10) + remainder;
                    palindrome = palindrome / 10;
                }
                return num == sum;
            } else {
                System.out.println("The integer must be non-negative!");
                return false;
            }
        }
    }



