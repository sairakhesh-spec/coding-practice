import java.util.*;
public class UsInNumberFirstTwoEqualTOLastTwoDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year/100)==(year%100))
            System.out.println("It is equal in both Firt two and Last two Number !");
        else
            System.out.println("It is not equal !");
    }
}