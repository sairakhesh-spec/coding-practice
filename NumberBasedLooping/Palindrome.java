import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int Orignial = n;  // 151 
     int rev = 0;    // 
     while(n > 0){
        rev = rev * 10 + (n % 10);  //  151 -> 1 ,-> 15 - 5,-> 1
        n = n / 10;                 // 151 -> 15, -> 1 , -> 0/
        }    
        System.out.println(" Yes ! It is a Palindrome: "+(rev == Orignial));
    }
    
}
