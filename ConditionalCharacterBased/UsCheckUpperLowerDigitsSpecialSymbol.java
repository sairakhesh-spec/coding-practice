import java.util.*;
public class UsCheckUpperLowerDigitsSpecialSymbol{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
       if(ch >= 'A' && ch <= 'Z'){
         System.out.println("Upper Case !");
       }
       else if(ch >='a' && ch <='z')
       {
        System.out.println("LowerCase !");
       }
       else if(ch >= '0' && ch <= '9' )
       {
         System.out.println("Digit !");
       }
       else {
        System.out.println("Symbol !");
       }

    }
}


       



        
