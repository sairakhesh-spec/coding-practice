import java.util.Scanner;
class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;           //A number whose square ends with the number itself -> Example: 25 → 625
        int temp = n;
        boolean flag = true;

        while (temp > 0) {
            if (temp % 10 != sq % 10) {
                flag = false;
                break;
            }
            temp /= 10;
            sq /= 10;
        }

        if (flag)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
