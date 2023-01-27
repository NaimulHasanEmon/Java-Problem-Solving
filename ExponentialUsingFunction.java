import java.util.Scanner;

public class ExponentialUsingFunction {
    public static void exponent(int number1, int number2) {
        System.out.println((int) Math.pow(number1, number2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(), number2 = sc.nextInt();
        exponent(number1, number2);
        sc.close();
    }
}