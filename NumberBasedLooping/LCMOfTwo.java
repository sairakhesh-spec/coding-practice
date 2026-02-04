import java.util.*;
public class LCMOfTwo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
    
      int start = (a > b)? a:b;

      for(int i = start ; i <= a*b ;i++){
          if(i % a == 0 &&  i % b == 0){
            System.out.println("LCM OF TWO NUMBER: "+i);
            break;
          }
        
        }
   }
}  

    
    