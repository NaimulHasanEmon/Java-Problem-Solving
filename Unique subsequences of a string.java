import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void uniqueSubsequences(String str, int i, String newString, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newString)) {
            } else {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char ch = str.charAt(i);
        uniqueSubsequences(str, i + 1, newString + ch, set);
        uniqueSubsequences(str, i + 1, newString, set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str, 0, "", set);
        sc.close();
    }
}
