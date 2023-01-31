import java.util.Scanner;

public class MatrixPatern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        int i, j, n = 1, m = 1;
        for (i = 1; i <= row; i++) {
            for (j = n; j <= m; j++) {
                System.out.print(j + " ");
            }
            n = j;
            m = j + i;
            System.out.println();
        }
        sc.close();
    }
}