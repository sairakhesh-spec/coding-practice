import java.util.*;

public class AlphabetsBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);

        for (char ch = start + 1; ch < end; ch++) {
            System.out.print(ch + " ");
        }
    }
}
