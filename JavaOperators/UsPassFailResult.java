import java.util.*;
public class UsPassFailResult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Mymark = sc.nextInt();
        if(Mymark>=50)
            System.out.println("Passed ! MARK is :"+Mymark);
        else if(Mymark<50)
            System.out.println("Failed ! MARK is :"+Mymark);

    } 
    
}
