import java.util.Scanner;
public class DayTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
            System.out.println("Weekend Price: ₹150");
        else
            System.out.println("Weekday Price: ₹100");
    }
}
