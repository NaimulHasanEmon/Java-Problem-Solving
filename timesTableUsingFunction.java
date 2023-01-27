import java.util.Scanner;

public class timesTableUsingFunction {
    public static void printTimesTable(int number) {
        if (number > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(+number + " x " + i + " = " + number * i);
            }
        } else
            System.out.println("Invalid input.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTimesTable(number);
        sc.close();
    }
}