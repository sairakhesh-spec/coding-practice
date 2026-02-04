import java.util.Scanner;
public class DiscountBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;

        if (bill >= 5000)
            discount = bill * 0.20;
        else if (bill >= 3000)
            discount = bill * 0.10;
        else
            discount = bill * 0.05;

        System.out.println("Payable Amount: " + (bill - discount));
    }
}
