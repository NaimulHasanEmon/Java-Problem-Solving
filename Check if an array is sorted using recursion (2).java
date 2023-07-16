import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean check(ArrayList<Integer> arr, int i) {
        if (i == arr.size() - 1) {
            return true;
        }
        if (arr.get(i) < arr.get(i + 1)) {
            return check(arr, i + 1);
        } else
            return false;

        //another way

        /*
        if (arr.get(i) >= arr.get(i+1)) {
            return false;
        } else
            return check(arr, i + 1);
        */

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements. If you want to stop input then put \"S\".");
        ArrayList<Integer> arr = new ArrayList<>();
        String x;
        while (true) {
            x = sc.next();
            if (x.equals("S")) {
                break;
            }
            arr.add(Integer.parseInt(x));
        }
        boolean z = check(arr, 0);
        if (z)
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }
}
