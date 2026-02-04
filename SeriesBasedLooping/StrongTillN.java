import java.util.*;
public class StrongTillN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){   // 145 // 14 // 1
            int digit = temp %10; // 145 -> 5 // 14 -> 4 // 1
            int fact = 1;
            for(int i = 1;i <= digit;i++){ // 5 // 4
                 fact = fact * i ;    // 5*i // 4*i
            }
        
              sum = sum + fact;  // 120 + // 24 + // 1 --> 145
              temp = temp / 10; // 145 -> 14  // 14 -> 1
        }
        if(sum == n )
            System.out.println("It is Strong bez :"+sum+"=="+n);
        else
            System.out.println("It is not Strong bez :"+sum+"=="+n);
    }
}