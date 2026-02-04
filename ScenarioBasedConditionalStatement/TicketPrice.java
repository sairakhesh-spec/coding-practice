import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 12)
            System.out.println("Ticket: ₹50");
        else if (age < 60)
            System.out.println("Ticket: ₹100");
        else
            System.out.println("Ticket: ₹70");
    }
}
