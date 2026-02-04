import java.util.Scanner;
public class MangoDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of mangoes: ");
        int mangoes = sc.nextInt();

        System.out.print("Enter price per mango: ");
        int price = sc.nextInt();

        int freeMangoes = mangoes / 4 ;   // Buy 3 Get 1 Free
        int paidMangoes = mangoes - freeMangoes; //  1-4 = 3 0r n-1 = n 
        int totalAmount = paidMangoes*price;  // m * p = tamount

        System.out.println("Free Mangoes: " + freeMangoes);
        System.out.println("Total Amount to Pay: " + totalAmount);
    }
}
