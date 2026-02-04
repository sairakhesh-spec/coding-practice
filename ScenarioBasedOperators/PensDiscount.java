import java.util.Scanner;

public class PensDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pens: ");
        int pens = sc.nextInt();

        System.out.print("Enter price per pen: ");
        int price = sc.nextInt();

        int freePens = (pens / 5) * 2;
        int payablePens = pens - freePens;
        int totalAmount = payablePens * price;

        System.out.println("Free pens: " + freePens);
        System.out.println("Total amount to pay: " + totalAmount);
    }
}