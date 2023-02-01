import java.util.*;

public class WordAndCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        String newString = name.trim().replaceAll(" +", " ");
        int count = 1;
        for (int i = 0; i < newString.length(); i++) {
            if (newString.codePointAt(i) == 32) {
                count++;
            }
        }
        System.out.println("Total word: " + count + "\n" + "Total characters: " + newString.length());
        sc.close();
    }
}