import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int num1 = sc.nextInt();
        System.out.print("Enter divisor : ");
        int num2 = sc.nextInt();
        int quotient = (int) Math.floor(num1 / (double) num2);
        int remainder = num1 - (num2 * quotient);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        sc.close();
    }
}