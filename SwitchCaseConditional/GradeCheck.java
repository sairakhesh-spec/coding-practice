import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 9:
            case 8:
                System.out.println("Grade A");
                break;
            case 7:
            case 6:
                System.out.println("Grade B");
                break;
            case 5:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
