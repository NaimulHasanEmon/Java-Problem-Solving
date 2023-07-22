import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = a, n = b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        int gcm = a;
        int lcm = (m * n) / gcm;
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
