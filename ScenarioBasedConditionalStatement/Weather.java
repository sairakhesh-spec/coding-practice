import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp < 20)
            System.out.println("Cold");
        else if (temp < 30)
            System.out.println("Pleasant");
        else if (temp < 40)
            System.out.println("Hot");
        else
            System.out.println("Heatwave");
    }
}
