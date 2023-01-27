import java.util.Scanner;

public class readMultipleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
        System.out.printf("%s\n%s\n%s\n", a, b, c);
        sc.close();
    }
}