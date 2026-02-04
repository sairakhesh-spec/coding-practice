import java.util.*;
public class UsleapOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0 && year%100 != 0)||(year%400==0))
            System.out.println("It leap a Year !");
        else
            System.out.println("It not a leap Year");

    }
}