import java.util.Scanner;

public class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 10;
        boolean asc = true;

        while (n > 0) {
            int d = n % 10;
            if (d > prev) {
                asc = false;
                break;
            }
            prev = d;
            n /= 10;
        }

        if (asc)
            System.out.println("Ascending order");
        else
            System.out.println("Not in ascending order");
    }
}
