import java.util.Scanner;

public class MatrixWithoutScanning2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();
        for (int i = 1; i <= row * col; i++) {
            System.out.print(i + " ");
            if (i % col == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}