import java.util.Scanner;

public class ArrayOfStringUsingForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name[] = new String[3];
        for (int i = 0; i < 3; i++) {
            name[i] = sc.nextLine();
        }
        for (String x : name) {
            System.out.println(x);
        }
        sc.close();
    }
}