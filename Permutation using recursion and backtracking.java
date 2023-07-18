import java.util.Scanner;

public class Main {
    public static void printPermutation(String str, String permutation, int index) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + currChar, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println("Permutations of " + str + " are: ");
        printPermutation(str, "", 0);
        sc.close();
    }
}
