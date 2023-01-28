import java.util.Scanner;

public class Scan2DArrayAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and columns you want?");
        int row = sc.nextInt(), col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the array numbers: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
