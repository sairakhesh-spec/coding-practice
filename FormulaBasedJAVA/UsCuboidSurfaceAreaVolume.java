import java.util.*;

public class UsCuboidSurfaceAreaVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
          
        double surfaceArea = 2 * (l*b + b*h + l*h);
        double volume = l * b * h;

        System.out.println("Surface Area of Cuboid = " + surfaceArea);
        System.out.println("Volume of Cuboid = " + volume);
    }
}
