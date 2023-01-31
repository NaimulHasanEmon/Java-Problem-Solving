import java.util.Scanner;

public class SumOfMatrixProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][] = new int[3][3];
        System.out.println("Enter 3x3 matrix elements: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        int sum = 0, sumofuper = 0, sumoflower = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += num[i][j];
                }
                if (i < j) {
                    sumofuper += num[i][j];
                }
                if (i > j) {
                    sumoflower += num[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal: " + sum);
        System.out.println("Sum of uper triangle: " + sumofuper);
        System.out.println("Sum of lower triangle: " + sumoflower);
        sc.close();
    }
}