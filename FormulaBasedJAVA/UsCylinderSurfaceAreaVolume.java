import java.util.*;

public class UsCylinderSurfaceAreaVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.print("Enter radius: ");
        System.out.print("Enter height: ");
        

        double surfaceArea = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;

        System.out.println("Surface Area of Cylinder = " + surfaceArea);
        System.out.println("Volume of Cylinder = " + volume);
    }
}
