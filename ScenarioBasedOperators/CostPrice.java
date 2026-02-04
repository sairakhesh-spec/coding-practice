import java.util.Scanner;
public class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double selling = sc.nextDouble();
        double loss = sc.nextDouble();

        System.out.println("CostPrice :"+(selling + loss));
    }
}
