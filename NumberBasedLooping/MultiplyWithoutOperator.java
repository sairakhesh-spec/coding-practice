import java.util.Scanner;
class MultiplyWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= b; i++) {
            result += a;
        }

        System.out.println(result);
    }
}

 /*
->Even though b is not used inside
  result = result + a;
  the for-loop runs from 1 to b,
  so the same value of a gets added again and again,
  and the sum keeps getting stored in result.
*/