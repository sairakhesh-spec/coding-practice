import java.util.*;
public class Harshad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
             sum = sum + temp % 10;           // 81 -> 8+1 -> 9
             temp = temp / 10;   
        }
        if(n % sum == 0)                     // 81 % sum(9) == 0
          System.out.println("it is Harshad Number: "+sum);
        else
          System.out.println("it is not Harshad Number: "+sum);

    }
}