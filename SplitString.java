import java.util.*;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        String split[] = name.split(" ");
        for (String x : split) {
            System.out.println(x);
        }
        sc.close();
    }
}