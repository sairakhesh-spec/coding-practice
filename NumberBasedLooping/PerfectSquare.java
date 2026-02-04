import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square  = (int)Math.sqrt(n);  // sqrt(9) = 3
        
        if(square * square ==  n)         // 3 * 3 == n(9)
            System.out.println("It is a Perfect Square: "+n);
        else
            System.out.println("It is a not Perfect Square: "+n);


    }
    
}
