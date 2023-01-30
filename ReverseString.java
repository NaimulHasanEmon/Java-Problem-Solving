import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("Reversed string is: ");
        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
        sc.close();
    }
}