public class isPalindrome {
    public static void main(String[] args) {
        isPalindrome();
    }
    public static void isPalindrome() {
        String word = "racecar";

        String reveredWord = "";

        boolean isPalindrome = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reveredWord = reveredWord + word.charAt(i);
        }

        // Checking if both the strings are equal
        if (word.equals(reveredWord)) {
            isPalindrome = true;
        }

        System.out.println("The String is palindrome: " + isPalindrome);
    }
}