import java.util.Scanner;

public class RemoveFirstAndLastSpaceOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        // Shows the main string length
        System.out.println(name.length());
        String newString = name.trim();
        // Shows the new string
        System.out.println(newString);
        // Shows the new string length
        System.out.println(newString.length());
        sc.close();
    }
}