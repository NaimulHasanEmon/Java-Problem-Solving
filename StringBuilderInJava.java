import java.util.Scanner;

public class StringBuilderInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sc.close();
    }
}