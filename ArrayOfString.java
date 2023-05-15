import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 strings: ");
        String name[] = new String[3];
        for (int i = 0; i < 3; i++) {
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }
}
