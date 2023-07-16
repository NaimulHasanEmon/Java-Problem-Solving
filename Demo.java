package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
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
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1))
                count++;
        }
        if (count == arr.size() - 1)
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }
}