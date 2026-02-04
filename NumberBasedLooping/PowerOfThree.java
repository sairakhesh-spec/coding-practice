import java.util.Scanner;
class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 1 && n % 3 == 0) {       //Check whether a number is 3ⁿ -> inpower 1,3,9,81...(1,2,3,4)
            n /= 3;
        }

        if (n == 1)
            System.out.println("Power of 3");
        else
            System.out.println("Not a Power of 3");
    }
}
