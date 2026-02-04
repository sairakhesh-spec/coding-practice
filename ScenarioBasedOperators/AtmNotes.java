import java.util.Scanner;

class ATMNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int note500 = amount / 500;
        amount = amount % 500;

        int note200 = amount / 200;
        amount = amount % 200;

        int note100 = amount / 100;

        System.out.println("500 Notes: " + note500);
        System.out.println("200 Notes: " + note200);
        System.out.println("100 Notes: " + note100);
    }
}
