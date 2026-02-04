import java.util.Scanner;
public class SellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        double profit = sc.nextDouble();

        System.out.println ("SellingPrice :"+(cost + profit));
    }
}
