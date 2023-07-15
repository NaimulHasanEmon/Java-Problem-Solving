import java.util.Scanner;

public class Main {
    public static void printRev(String str, int i) {
        if (i == 0) {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        printRev(str, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times you want to check: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < n; j++) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            printRev(str, str.length() - 1);
            System.out.println();
        }
        sc.close();
    }
}
