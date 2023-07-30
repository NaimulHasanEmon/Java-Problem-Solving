import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        n.add(5);
        n.add(2);
        n.add(8);
        n.add(4);
        n.add(0);
        System.out.println("Original array: " + n);
        Collections.sort(n);
        System.out.println("Ascending order sorted array: " + n);
        Collections.reverse(n);
        System.out.println("Descending order sorted array: " + n);
        sc.close();
    }
}
