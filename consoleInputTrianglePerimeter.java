//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class consoleInputTrianglePerimeter {
    consoleInputTrianglePerimeter() {
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter value for a ");
        int objA = Integer.parseInt(a.nextLine());
        Scanner b = new Scanner(System.in);
        System.out.println("Enter value for b ");
        int objB = Integer.parseInt(b.nextLine());
        Scanner c = new Scanner(System.in);
        System.out.println("Enter value for c ");
        int objC = Integer.parseInt(c.nextLine());
        System.out.println("Perimeter of the triangle is: " + (objA + objB + objC));
    }
}
