import java.util.*;

public class ClearBitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        System.out.println("New Number: " + ((~bitMask) & num));
        sc.close();
    }
}