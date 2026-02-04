import java.util.Scanner;
class PowerOfMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // base
        int n = sc.nextInt(); // power
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result*m;
        }

        System.out.println(result);
    }
}

/* result=m^n  ---->  | Iteration (`i`) | Calculation    | result |
| --------------- | -------------- | ------ |
| 1               | result = 1 × 2 | 2      |
| 2               | result = 2 × 2 | 4      |
| 3               | result = 4 × 2 | 8      |
| 4               | result = 8 × 2 | 16     |
 */
