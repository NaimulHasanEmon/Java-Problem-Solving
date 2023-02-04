import java.util.*;

public class PalindromeUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String n = sc.nextLine();
        StringBuffer buffN = new StringBuffer(n);
        String p = buffN.reverse().toString();
        if (n.compareTo(p) == 0)
            System.out.println("Palindrome.");
        else
            System.out.println("Not Palindrome.");
        sc.close();
    }
}