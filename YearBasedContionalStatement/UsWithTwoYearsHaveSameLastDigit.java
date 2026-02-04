import java.util.*;
public class UsWithTwoYearsHaveSameLastDigit {
          public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int year1 = sc.nextInt();
            int year2 = sc.nextInt();
            if((year1%100)==(year2%100))
                System.out.println("It is Same in last two digit in two years !");
            else
                System.out.println("It is not same in last two digit in two years !");
          }
}
