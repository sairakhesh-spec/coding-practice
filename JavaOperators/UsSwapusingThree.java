import java.util.Scanner;
public class UsSwapusingThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c ;

        c = b;
        b = a;
        a = c;


        System.out.println("a:" + "" +a+ "\n" + "b:" +b);

    }
    
}
