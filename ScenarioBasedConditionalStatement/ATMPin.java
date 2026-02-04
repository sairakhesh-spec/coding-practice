import java.util.Scanner;
public class ATMPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if (pin == 1234)
            System.out.println("Access Granted");
        else
            System.out.println("Wrong PIN");
    }
}
