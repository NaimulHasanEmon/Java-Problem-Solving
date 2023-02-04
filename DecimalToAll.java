import java.util.*;

public class DecimalToAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String bin = Integer.toBinaryString(decimal);
        String hex = Integer.toHexString(decimal);
        String oct = Integer.toOctalString(decimal);
        System.out.println(bin);
        System.out.println(hex);
        System.out.println(oct);
        sc.close();
    }
}