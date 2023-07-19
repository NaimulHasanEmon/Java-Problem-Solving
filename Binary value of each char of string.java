import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.println("ASCII Value of each character is: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(Integer.toBinaryString(name.codePointAt(i)));
        }
        sc.close();
    }
}
