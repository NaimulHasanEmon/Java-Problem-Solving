import java.util.Scanner;

public class Main {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurrence(int i, String str, char check) {
        if (i == str.length()) {
            System.out.println("First occurrence of " + check + " is at index = " + first);
            if (last != -1) {
                System.out.println("Last occurrence of " + check + " is at index = " + last);
            } else
                System.out.println("Last occurrence of " + check + " is at index = " + first);
            return;
        }
        if (str.charAt(i) == check) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        printOccurrence(i + 1, str, check);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of string = " + str.length());
        System.out.print("Enter which character you want to search: ");
        char check = sc.next().charAt(0);
        printOccurrence(0, str, check);
        sc.close();
    }
}