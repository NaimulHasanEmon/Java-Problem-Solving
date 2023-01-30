import java.util.*;

public class DeleteStringAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("Enter starting and ending index for delete: ");
        int s = sc.nextInt(), e = sc.nextInt();
        sb.delete(s, e);
        System.out.print("Final string is: " + sb);
        sc.close();
    }
}