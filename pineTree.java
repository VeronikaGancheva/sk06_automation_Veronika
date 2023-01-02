//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class pineTree {
    public pineTree() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            int k;
            for(k = 0; k < 10 - i; ++k) {
                System.out.print(" ");
            }

            for(k = 0; k < 2 * i + 1; ++k) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}