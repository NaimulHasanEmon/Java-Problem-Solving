import java.util.Scanner;

public class Main {
    public static int printPower(int x, int n) {
        if (n == 0) {  //base case 1
            return 1;
        }
        if (x == 0) {  //base case 2
            return 0;
        }
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else
            return printPower(x, n / 2) * printPower(x, n / 2) * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println(printPower(x, n));
        sc.close();
    }
}