import java.util.Scanner;

public class Google {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Before remove repetitions = " + str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1))
                sb.append(str.charAt(i));
            else {
                i++;
            }
        }
        System.out.println("After remove repetitions = " + sb);
        sc.close();
    }
}
