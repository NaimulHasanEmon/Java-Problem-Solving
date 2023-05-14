import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(num.size());
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(3, 20);
        for (int x : num) {
            System.out.println(x);
        }
        // System.out.println(num);
        // This can also be used for printing.
        System.out.println(num.size());
    }
}
