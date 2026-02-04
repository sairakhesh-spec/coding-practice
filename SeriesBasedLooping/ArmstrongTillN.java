import java.util.Scanner;

public class ArmstrongTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n ;
        int sum = 0;
        int count = 0;
         
        while(temp>0){ // 153 // 15
            count++;    // 3
            temp = temp / 10; // 153 // 3 // 5 // 1
        }
        temp = n;
        while(temp>0){
            
           int d = temp % 10;  // 3 // 5 
           sum = sum + (int)Math.pow(d,count);  // 3^3 // 5^5 
            // 0+27  // 27+125  // 152+1
           temp = temp/10;  //  153 // 15 //1
        }
        if(sum == n)
            System.out.println("it is a Armstrong bez:"+sum+"=="+n);
        else
            System.out.println("it is not Armstrong bez:"+sum+"=="+n);

        
    }
}
