import java.util.Scanner;
public class DistributeCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();

        System.out.println(candies / people);
    }
}
