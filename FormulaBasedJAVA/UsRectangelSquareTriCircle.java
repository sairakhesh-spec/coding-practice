import java.util.*;
public class UsRectangelSquareTriCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int S = sc.nextInt();
        int r = sc.nextInt();
        int h = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();


        System.out.println("Length :" +l);
        System.out.println("Breath :" +b);
        System.out.println("Side   :" +S);
        System.out.println("Radius :" +r);
        System.out.println("Height :" +h);
        System.out.println("Side1 :" +s1+ ",Side2 :" +s2+ ",Side3 :" +s3);

        System.out.println("Area of Rectangle :"+(l*b)+",Perimeter of Rectangle :"+(2*(l+b)) );

        System.out.println("Area of SQUARE :"+(S*S)+",Perimeter Of SQUARE :"+(4*S) );

        System.out.println("Area of TRIANGLE :"+(0.5*b*h)+",Perimeter Of TRIANGLE :"+(s1+s2+s3) ) ;

        System.out.println("Area of CIRCLE :"+(3.14*r*r)+"Perimeter of CIRCLE :"+(2*3.14*r) );

    }
}