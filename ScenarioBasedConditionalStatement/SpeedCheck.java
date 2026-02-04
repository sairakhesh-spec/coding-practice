import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if (speed > 100)
            System.out.println("Over Speed");
        else
            System.out.println("Within Limit");
    }
}
