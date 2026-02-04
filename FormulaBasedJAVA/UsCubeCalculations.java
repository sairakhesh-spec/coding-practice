import java.util.*;

public class UsCubeCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int surfaceArea = 6 * a * a;
        int volume = a * a * a;
        int perimeter = 12 * a;

        System.out.println("Surface Area of Cube = " + surfaceArea);
        System.out.println("Volume of Cube = " + volume);
        System.out.println("Perimeter of Cube = " + perimeter);
    }
}
