import java.util.Scanner;
public class TotalCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trays = sc.nextInt();
        int cakesPerTray = sc.nextInt();

        System.out.println("Total Cakes ="+(trays * cakesPerTray));
    }
}
