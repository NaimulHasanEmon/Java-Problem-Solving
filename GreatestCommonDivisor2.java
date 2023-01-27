import java.util.Scanner;

public class GreatestCommonDivisor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        while (n != m) {
            if (n > m)
                n = n - m;
            else
                m = m - n;
        }
        System.out.println(m);
        sc.close();
    }
};