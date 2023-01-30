import java.util.Scanner;

public class stringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        if (firstName.compareTo(lastName) == 0) {
            System.out.println("Equal.");
        } else if (firstName.compareTo(lastName) < 0) {
            System.out.println("First string is less then second string.");
        } else {
            System.out.println("First string is greater than second string.");
        }
        sc.close();
    }
}