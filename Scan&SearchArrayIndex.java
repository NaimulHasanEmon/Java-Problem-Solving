import java.util.Scanner;

public class ScanAndSearchArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter which number you want to search: ");
        int s = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                System.out.println("Your searched number is in index " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sorry! Your searched number is not present in the database.");
        }
        sc.close();
    }
}
