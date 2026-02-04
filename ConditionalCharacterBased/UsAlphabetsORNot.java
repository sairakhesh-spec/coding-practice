import java.util.*;
public class UsAlphabetsORNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'b')){
            System.out.println("It is a Alphabet !");
        }
        else
            System.out.println("Its is not a Alphabet !");
    }
    
}
