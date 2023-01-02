import java.util.Scanner;

class consoleInputTriangleArea {
    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.println("Enter value for b ");
        float objB = Integer.parseInt(b.nextLine());

        Scanner h = new Scanner(System.in);
        System.out.println("Enter value for h ");
        float objH = Integer.parseInt(h.nextLine());

        System.out.println("Area of a triangle is: " + (objB * objH)/2);
    }
}