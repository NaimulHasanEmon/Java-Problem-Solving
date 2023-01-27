import java.util.Scanner;

public class factorialUsingFunction {
    public static void printFactorial(int number) {
        if (number >= 0) {
            int multiple = 1;
            for (int i = 1; i <= number; i++) {
                multiple = multiple * i;
            }
            System.out.println(multiple);
        } else
            System.out.println("Invalid input.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printFactorial(number);
        sc.close();
    }
}