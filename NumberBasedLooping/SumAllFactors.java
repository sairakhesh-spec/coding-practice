import java.util.*;
public class SumAllFactors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
    
        for(int i = 1;i <= n;i++){
            if(n % i == 0){     // 4 - 1 + 2 + 4 = 
            sum = sum + i;  // sum(1) = sum(0) + i(1) -> 1 + i(2)
            }               //                       3 -> 3 + i(4) -> 7 
            
        }
            System.out.println("The Sum Of Factorial: "+sum);
    }
}