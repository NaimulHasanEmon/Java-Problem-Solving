import java.util.Scanner;

public class Message {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many times you want to print: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("What message you want to print: ");
		String str = sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
		sc.close();
	}
}
