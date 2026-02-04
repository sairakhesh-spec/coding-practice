import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, num = 2;

        while (count < n) {
            int c = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    c++;
            }
            if (c == 2) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
