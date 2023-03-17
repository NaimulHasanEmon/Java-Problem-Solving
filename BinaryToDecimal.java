import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int bin = sc.nextInt();
        String s = Integer.toString(bin);
        int rem;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            rem = bin % 10;
            bin = bin / 10;
            if (j >= 0)
                sum = sum + (rem * (int) (Math.pow(2, j)));
            j++;
        }
        System.out.println("Decimal = " + sum);
        sc.close();
    }
}