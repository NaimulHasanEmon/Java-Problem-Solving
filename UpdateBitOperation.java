import java.util.*;

public class UpdateBitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        System.out.print("What number you want to put: ");
        int up = sc.nextInt();
        if (up == 0) {
            System.out.println("New Number: " + ((~bitMask) & num));
        } else
            System.out.println(bitMask | num);
        sc.close();
    }
}