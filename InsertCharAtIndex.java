import java.util.*;

public class InsertCharAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuilder str = new StringBuilder(name);
        System.out.print("Enter Index number: ");
        int num = sc.nextInt();
        System.out.print("Enter the character you want to insert: ");
        char ch = sc.next().charAt(0);
        str.insert(num, ch);
        System.out.print("Your inserted string is: " + str);
        sc.close();
    }
}