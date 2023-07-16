import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 2, 5, 1));
        System.out.println("Original: " + arr);
        Collections.shuffle(arr);
        System.out.println("Shuffled: " + arr);
        Collections.sort(arr);
        System.out.println("Sorted: " + arr);
        int target = 7;
        int index = Collections.binarySearch(arr, target);
        System.out.println("Targeted number 7 is in index " + index);
        sc.close();
    }
}
