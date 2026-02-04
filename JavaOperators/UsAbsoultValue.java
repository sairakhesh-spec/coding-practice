import java.util.*;
public class UsAbsoultValue{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int Absoultvalue = Math.abs(num); // negative -> positive / positive -> positive /zero -> zero
      System.out.println(Absoultvalue);

    }
}
