import java.util.*;

public class PalindromeUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        StringBuffer firstBuff = new StringBuffer(sc.nextLine());
        System.out.print("Enter second String: ");
        StringBuffer secondBuff = new StringBuffer(sc.nextLine());
        if (firstBuff.compareTo(secondBuff.reverse()) == 0) {
            System.out.println("Palindrome.");
        } else
            System.out.println("Not Palindrome.");
        sc.close();
    }
}