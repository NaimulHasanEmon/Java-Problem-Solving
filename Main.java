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
        System.out.println(n);
        Collections.sort(n);
        System.out.println(n);
        Collections.reverse(n);
        System.out.println(n);
        sc.close();
    }
}