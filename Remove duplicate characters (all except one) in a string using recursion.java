import java.util.Scanner;

public class Main {
    public static void delRepeat(String str, int i, StringBuilder sb) {
        if (i == str.length()) {
            System.out.println("After remove repetitions = " + sb);
            return;
        }
        if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1))
            sb.append(str.charAt(i));
        delRepeat(str, i + 1, sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Before remove repetitions = " + str);
        StringBuilder sb = new StringBuilder();
        delRepeat(str, 0, sb);
        sc.close();
    }
}
