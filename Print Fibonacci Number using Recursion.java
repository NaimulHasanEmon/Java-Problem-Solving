import java.util.Scanner;

public class Main {
    static void printFibonacci(int n, int a, int b, int i) {
        int res = a + b;
        if (n == i) {
            System.out.println(a);
            return;
        }
        System.out.println(a);
        printFibonacci(n, res, a, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many you want: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        printFibonacci(n, a, b, 1);
        sc.close();
    }
}
