public class FiLogical {
    public static void main(String[] args) {
     int a = 15;
     System.out.println("a = 15");
     
    boolean S1 = (a > 14) && (a < 20);
    System.out.println("And Operator:"+S1); 

    boolean S2 = (a > 15) || (a < 20);
    System.out.println("OR Operator:"+S2);

     boolean S3 = !(a != 20);
    System.out.println("NOT Operator:"+S3);

    }
}
