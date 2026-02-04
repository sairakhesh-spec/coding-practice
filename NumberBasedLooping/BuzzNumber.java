import java.util.Scanner;
class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 7 == 0 || n % 10 == 7)        // divisible by 7 OR end with 7
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}
