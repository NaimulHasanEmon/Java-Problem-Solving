import java.util.*;

public class ReverseStringWithIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.print("Enter an index: ");
        int num = sc.nextInt();
        System.out.println("Character at index " + num + " is = " + sb.charAt(num));
        char newString[] = new char[sb.length()];
        for (int i = sb.length() - 1, j = 0; i >= 0; i--, j++) {
            newString[j] = sb.charAt(i);
        }
        System.out.print("Reversed string is: ");
        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]);
        }
        System.out.println();
        System.out.println("Character of reversed string at index " + num + " is = " + newString[num]);
        sc.close();
    }
}