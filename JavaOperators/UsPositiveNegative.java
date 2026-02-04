import java.util.*;
public class UsPositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0)
            System.out.println("Neight positive nor negative");

        else if(num>=1)
        System.out.println("It is a positive Integer");

        else
        System.out.println("It is not a positive Integer");
    }
}
