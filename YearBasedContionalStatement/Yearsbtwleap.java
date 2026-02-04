import java.util.*;
public class Yearsbtwleap {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int Year = sc.nextInt();
       int Year2 = sc.nextInt();
       for(int i = Year ;i <= Year2;i++){
        if(i%4==0){
            System.out.println("Leap Year" +i);
        }else
             System.out.println("It is not Leap Year" +i);
       }
  
    }
    
}
