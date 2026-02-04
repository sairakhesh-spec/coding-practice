import java.util.*;
public class UsCheckDigitORNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= '0' && ch <= '9')
            System.out.println("It is Digit !");
        else
            System.out.println("It is not Digit !");
    }
    
}
