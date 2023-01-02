public class reverseList {
    public static void main(String[] args) {
        reverseList();
    }
    public static void reverseList() {
        int[] list = {10, 20, 30, 40, 50};

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }
}

