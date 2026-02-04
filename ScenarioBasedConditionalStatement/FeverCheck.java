import java.util.Scanner;
public class FeverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp > 100)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }
}
