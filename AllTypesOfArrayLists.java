import java.util.ArrayList;
import java.util.Collections;

public class AllTypesOfArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(5);
        list.add(4);
        System.out.println(list);

        // get elements
        System.out.println(list.get(1));

        // add elements in between
        list.add(2, 7);
        System.out.println(list);

        // Set elements
        list.set(2, 9);
        System.out.println(list);

        // Delete elements
        list.remove(0);
        System.out.println(list);

        // Size of ArrayList
        System.out.println(list.size());

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}