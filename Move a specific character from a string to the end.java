import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String y = sc.nextLine();
        System.out.println("Original string = " + y);
        char[] x = y.toCharArray();
        ArrayList<Character> ar1 = new ArrayList<>();
        ArrayList<Character> ar2 = new ArrayList<>();
        System.out.print("Which character you want to step aside = ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < y.length(); i++) {
            if (x[i] == ch)
                ar2.add(x[i]);
            else
                ar1.add(x[i]);
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char p : ar1) {
            sb1.append(p);
        }
        for (char q : ar2) {
            sb2.append(q);
        }
        System.out.println("After moving all " + ch + " new string is = " + sb1.append(sb2));
        sc.close();
    }
}
