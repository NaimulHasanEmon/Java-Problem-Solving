import java.util.Scanner;

public class setCharacterAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.println("Your inputed string is: " + sb);
        System.out.print("Enter Index number: ");
        int num = sc.nextInt();
        System.out.print("Enter the character you want to set: ");
        char ch = sc.next().charAt(0);
        sb.setCharAt(num, ch);
        System.out.println("Final string is: " + sb);
        sc.close();
    }
}