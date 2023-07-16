import java.util.Scanner;

public class Main {
    public static void moveAllChar(String str, char ch, int i, int count, String newString) {
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                newString += ch;
            }
            System.out.print("After moving all " + ch + ", the new string is = " + newString);
            return;
        }
        char currChar = str.charAt(i);
        if (currChar == ch) {
            count++;
            moveAllChar(str, ch, i + 1, count, newString);
        } else {
            newString += currChar;
            moveAllChar(str, ch, i + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Original string = " + str);
        System.out.print("Which character you want to move to the end = ");
        char ch = sc.next().charAt(0);
        moveAllChar(str, ch, 0, 0, "");
        sc.close();
    }
}
