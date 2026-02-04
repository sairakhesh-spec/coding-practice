import java.util.*;
public class AllFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number: "+n);
        for(int i = 1;i <= n;i++){    
            if( n % i == 0)
                System.out.println("The Factorial numbers: "+i);
        }

    }         // 2 -> 1 , 2 
              // 4 -> 1 ,2 ,4 
}
