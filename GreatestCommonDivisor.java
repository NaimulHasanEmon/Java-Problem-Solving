import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int temp;
        int p = n, q = m;
        if (n > m) {
            temp = n;
            n = m;
            m = temp;
        }
        int r, x;
        int i = 0;
        do {
            x = m / n;
            r = m % n;
            if (r == 0) {
                System.out.println("Greatest Common Divisor of " + p + " and " + q + " is: " + n);
                break;
            } else {
                m = n;
                n = r;
            }
            i++;
        } while (r != 0);
        sc.close();
    }
}