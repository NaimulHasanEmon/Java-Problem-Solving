import java.util.*;

public class DecimalToAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = sc.nextLine();
        Integer dec = Integer.parseInt(bin, 2);
        System.out.println("Decimal = " + dec);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();
        Integer dec2 = Integer.parseInt(hex, 16);
        System.out.println("Decimal = " + dec2);
        System.out.print("Enter a binary number: ");
        String oct = sc.nextLine();
        Integer dec3 = Integer.parseInt(oct, 8);
        System.out.println("Decimal = " + dec3);
        sc.close();
    }
}