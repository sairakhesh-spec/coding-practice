import java.util.Scanner;
public class Usbitwise {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     int a = sc.nextInt();
     System.out.println("a :"+a);
     int b = sc.nextInt();
     System.out.println("b :"+b);

      System.out.println("And :"+(a & b)); //AND
        System.out.println("OR :"+(a | b)); // OR
        System.out.println("XOR :"+(a ^ b)); //XOR
        System.out.println("NOT :"+(~a));    //NOT
        System.out.println("leftshift :"+(a << b)); //leftshift(x2)
        System.out.println("Rightshift :"+(a >> b)); //Rightshift(div2)
        System.out.println("unsigned rightshift :"+(a >>> b)); // unsigned rightshift

    }
    
}
