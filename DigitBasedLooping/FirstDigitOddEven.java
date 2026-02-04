import java.util.Scanner;
public class FirstDigitOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10)
            n /= 10;

        if (n % 2 == 0)
            System.out.println("First digit is Even");
        else
            System.out.println("First digit is Odd");
    }
}


