public class countWordsInAString {
    public static void main(String[] args) {
        System.out.println(countWords("My test method"));
    }
        public static int countWords (String text){
            text = text.trim();
            int count = 0;
            int textLength = text.length();

            if (textLength > 1) {
                count++; //After trim() the text will always start with a word

                for (int i = 1; i < textLength; i++) {
                    if (text.charAt(i) == ' ') {
                        count++;
                    }
                }
            }

            return count;
        }
    }

