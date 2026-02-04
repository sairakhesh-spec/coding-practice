import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int digit = n%10; // 81 -> 1 -> 8
            rev = rev*10 + digit;
            n = n/10;    // 81 -> 8      

        }
          System.out.println("reverse the number: "+rev);
    }
    
}
