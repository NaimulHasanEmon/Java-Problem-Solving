import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Original string = " + str);
        char[] charArray = str.toCharArray();
        System.out.print("Which character you want to move to the end = ");
        char ch = sc.next().charAt(0);
        ArrayList<Character> first = new ArrayList<>();
        System.out.print("After moving all " + ch + ", the new string is = ");
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == ch) {
                first.add(charArray[i]);
            } else {
                System.out.print(charArray[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char x : first) {
            sb.append(x);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
