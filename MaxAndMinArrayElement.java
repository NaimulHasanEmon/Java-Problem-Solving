import java.util.Scanner;

public class MaxAndMinArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to check: ");
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double max = arr[0], min = arr[1];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max + "\n" + "Minimum element is: " + min);
        sc.close();
    }
}