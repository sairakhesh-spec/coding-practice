import java.util.Scanner;
public class PriceAfterDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = sc.nextDouble();

        double finalPrice = price - (price * discount / 100);
        System.out.println(finalPrice);
    }
}
