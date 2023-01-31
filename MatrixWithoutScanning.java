import java.util.Scanner;

public class MatrixWithoutScanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();
        int i, j, n = 1, m = col;
        for (i = 1; i <= row; i++) {
            for (j = n; j <= m; j++) {
                System.out.print(j + "\t");
            }
            n = j;
            m = j + col - 1;
            System.out.println();
        }
        sc.close();
    }
}
