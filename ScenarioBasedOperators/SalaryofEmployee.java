import java.util.*;
public class SalaryofEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your positision :");
        String Position = sc.nextLine();

        int Salary = 50000;
        int Increment = 5000;
        int TotalAmount = Salary+Increment ;
        
        if (Position.equals("HR")) {
            System.out.println(" Your Salary: " + Salary);   
            System.out.println("Your Increment: " +Increment);
            System.out.println("Salary + Increment:" +TotalAmount );
        }else{
            System.out.println("No position");
        }
    }
}
