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
        
        // Compare if two arry list are same or note
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println(list2.equals(list3));

        // Copy
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(list2);
        System.out.println(list4);
    }
}
