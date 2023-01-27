import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = num % 2;
        switch (rem) {
            case 0:
                System.out.println("Even.");
                break;
            default:
                System.out.println("Odd.");
        }
        sc.close();
    }
}