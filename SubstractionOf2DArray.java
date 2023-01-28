import java.util.Scanner;

public class SubstractionOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and columns you want?");
        int row = sc.nextInt(), col = sc.nextInt();
        int arr[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        System.out.println("Enter first array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Substraction from 1st array to 2nd array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((arr[i][j] - arr2[i][j]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}