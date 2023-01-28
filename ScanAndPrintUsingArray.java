import java.util.Scanner;

public class ScanAndPrintUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to add in your array: ");
        int n = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter array values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your enterd array values are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}