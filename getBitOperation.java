import java.util.*;

public class getBitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        if ((bitMask & num) == 0) {
            System.out.println("Zero.");
        } else {
            System.out.println("One.");
        }
        sc.close();
    }
}