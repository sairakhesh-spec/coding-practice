import java.util.*;
public class UsMiddleValue {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int MiddleValue = (num/10)%10;
    System.out.println("Middle Value:"+MiddleValue);
    }
}
