import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void check(ArrayList<Integer> arr, int count, int i) {
        if (i == arr.size() - 1) {
            if (count == arr.size() - 1)
                System.out.println("Sorted");
            else
                System.out.println("Not sorted");
            return;
        }
        if (arr.get(i) < arr.get(i + 1))
            count++;
        check(arr, count, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements. If you want to stop input then put \"S\".");
        ArrayList<Integer> arr = new ArrayList<>();
        String x;
        while (true) {
            x = sc.next();
            if (x.equals("S"))
                break;
            arr.add(Integer.parseInt(x));
        }
        check(arr, 0, 0);
        sc.close();
    }
}