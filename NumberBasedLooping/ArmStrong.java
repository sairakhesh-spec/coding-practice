import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        
        while(temp>0){                  // 151 - 1*3 + 5*3 + 1*3
            count++;
             temp = temp/10;   // Q(temp) - 1,5,1. nxt temp = empty
        }
        int sum = 0; 
        temp = n; 

        while(temp > 0) {                      
            int rem = temp%10;            //          23(temp) % 10 = Q(rem) - 3 , 2
            sum = sum + (int)Math.pow(rem,count);
            temp = temp/10;
        }

        if(sum == n)
        System.out.println("It is armstrong: "+sum);
       else
        System.out.println("It is not armstrong : "+sum);


    }
    
}
