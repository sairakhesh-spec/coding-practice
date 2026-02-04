import java.util.Scanner;
public class PercentageDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        if (amount >= 3000)
            amount -= amount * 0.15;

        System.out.println("Pay Amount: " + amount);
    }
}
