import java.util.*;

public class UsFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Celsius = " + celsius);
    }
}
