import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();

        int decimal = 0;
        int base = 1;

        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1')
                decimal += base;
            base *= 2;
        }

        System.out.println(decimal);
    }
}
