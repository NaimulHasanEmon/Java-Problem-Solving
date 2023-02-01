import java.util.Scanner;

public class SearchIndexOfCharOrStringOnAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.print("Enter a string or character to search: ");
        String src = sc.nextLine();
        System.out.println(name.length());
        System.out.println(name.lastIndexOf(src)); // Shows the last index of appearance.
        sc.close();
    }
}