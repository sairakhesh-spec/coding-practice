import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Balance = " + balance);
                break;
            case 2:
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                balance = balance - amt;
                System.out.println("Balance = " + balance);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
