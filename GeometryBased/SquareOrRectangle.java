import java.util.Scanner;

public class SquareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}
