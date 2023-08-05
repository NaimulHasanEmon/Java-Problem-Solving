import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 44}, {33, 34, 38, 50}};
        while (true) {
            System.out.print("Enter your target search: ");
            int n = sc.nextInt();
            System.out.println(Arrays.toString(search(arr, n)));
        }
    }

    static int[] search(int[][] arr, int n) {
        int row = 0, col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == n) {
                return new int[]{row, col};
            }
            if (arr[row][col] > n)
                col--;
            else
                row++;
        }
        return new int[]{-1, -1};
    }
}