import java.util.Scanner;

public class Main {
    public static void subsequences(String str, int i, String newString) {
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(i);
        subsequences(str, i + 1, newString + ch);
        subsequences(str, i + 1, newString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        subsequences(str, 0, "");
        sc.close();
    }
}