import java.util.Scanner;

public class DescendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = -1;
        boolean desc = true;

        while (n > 0) {
            int d = n % 10;
            if (d < prev) {
                desc = false;
                break;
            }
            prev = d;
            n /= 10;
        }

        if (desc)
            System.out.println("Descending order");
        else
            System.out.println("Not in descending order");
    }
}
