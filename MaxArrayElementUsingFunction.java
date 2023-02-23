import java.util.*;

public class MaxArrayElementUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        // First method
        System.out.println("The maximum element is = " + Arrays.stream(num).max().getAsInt());
        int max = num[0];
        for (int i = 0; i < 5; i++) {
            if (max < num[i])
                max = num[i];
        }
        // Second method
        System.out.println("The maximum element is = " + max);
        sc.close();
    }
}