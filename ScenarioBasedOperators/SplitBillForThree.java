import java.util.Scanner;
public class SplitBillForThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        System.out.println(bill / 3);
    }
}
