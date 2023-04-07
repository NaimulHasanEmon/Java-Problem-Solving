import java.util.Scanner;

public class CountRepeatedCharactersFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (ch[i] == ch[j] && ch[j] != '*') {
                    count++;
                    ch[j] = '*';
                }
            }
            if (count > 0) {
                System.out.println(ch[i] + " has repeated " + (count + 1) + " times");
                total++;
            }
        }
        System.out.println("Total repeated character: " + total);
        sc.close();
    }
}