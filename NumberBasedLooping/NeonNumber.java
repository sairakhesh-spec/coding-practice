import java.util.*;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 9 -> 9*9 = 81 -> 8+1 = 9
        int sq = n * n;
        int sum = 0;

        while(sq > 0){
            sum = sum + (sq % 10) ;  // Q -> 1 -> sum(1) -> sum(1)+(8) -> 9
            sq = sq / 10;          // R -> 8 
        }
         if(sum == n)
            System.out.println(n+"  It is Neon Number: " +"After n + n = " +sum);
        else
            System.out.println("It is not Neon Number: "+sum);
    }
    
}
