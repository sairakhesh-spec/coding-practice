import java.util.*;
public class SumofDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int sum = 0;

         while(n > 0){
            sum = sum + n % 10 ;  // 81 -> 1 ,  }  -> 1+8 -> 9
            n = n / 10 ;          // 81 -> 8    }
         }
         System.out.println("Sum Of Digit: "+sum);
    }
    
}
