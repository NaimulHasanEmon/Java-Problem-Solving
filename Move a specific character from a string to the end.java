import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        System.out.println("Write down what you want to add: ");
        String add = sc.nextLine();
        sb.append(" " + add);
        System.out.println(sb);
        sc.close();
    }
}
