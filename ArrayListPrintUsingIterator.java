import java.util.*;

public class ArrayListPrintUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(3, 20);
        Iterator<Integer> itr = num.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
