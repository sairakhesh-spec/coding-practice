import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int last = n % 10;
        int first = 0, count = 0;

        while (temp > 0) {
            first = temp % 10;
            temp /= 10;
            count++;
        }

        int middle = (n % (int)Math.pow(10, count - 1)) / 10;
        int result = last * (int)Math.pow(10, count - 1) + middle * 10 + first;

        System.out.println(result);
    }
}
