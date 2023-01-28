import java.util.Scanner;

public class ScanAndSearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and columns you want?");
        int row = sc.nextInt(), col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to search: ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == n) {
                    System.out.println("Your searched number is in [" + i + "," + j + "] index.");
                    count = 0;
                }
            }
        }
        if (count > 0)
            System.out.println("Sorry! Your searched number is absent in the database.");
        sc.close();
    }
}
