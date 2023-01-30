import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Name = sc.nextLine();
        System.out.print("Enter beginning index: ");
        int n = sc.nextInt();
        System.out.print("Enter ending index: ");
        int m = sc.nextInt();
        String sub = Name.substring(n, m);
        System.out.println("The substring is: " + sub);
        sc.close();
    }
}