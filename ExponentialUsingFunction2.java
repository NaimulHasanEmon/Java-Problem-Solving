import java.util.Scanner;

public class ExponentialUsingFunction2 {
    public static void exponent(int number1, int number2) {
        int sum = 1, n = number1;
        for (int i = 1; i < number2; i++) {
            sum = n * number1;
            n = sum;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(), number2 = sc.nextInt();
        exponent(number1, number2);
        sc.close();
    }
}