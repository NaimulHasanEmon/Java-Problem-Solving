import java.util.*;

public class AppendString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("Enter new string: ");
        String str = sc.nextLine();
        sb.append(str);
        System.out.print("Final string is: " + sb);
        sc.close();
    }
}