import java.util.Scanner;

public class StringToCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        for (int i = 0; i < (firstName + lastName).length(); i++) {
            System.out.println((firstName + lastName).charAt(i));
        }
        sc.close();
    }
}