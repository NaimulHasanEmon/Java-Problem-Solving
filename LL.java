import java.util.Scanner;

class LL {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter target number: ");
            int n = sc.nextInt();
            int row = 0, col = arr.length - 1;
            while (row < arr.length && col >= 0) {
                if (arr[row][col] == n) {
                    System.out.println("Found at " + row + ", " + col);
                    break;
                }
                if (arr[row][col] > n)
                    col--;
                else
                    row++;
            }
    }
}