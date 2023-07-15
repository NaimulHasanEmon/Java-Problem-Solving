import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of string = " + str.length());
        System.out.print("Enter which character you want to search: ");
        char chck = sc.next().charAt(0);
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chck) {
                intArray.add(i);
            }
        }
        // one way
        System.out.println("First occurrence of " + chck + " is at index = " + intArray.get(0));
        System.out.println("Last occurrence of " + chck + " is at index = " + intArray.get(intArray.size() - 1));
        System.out.println(intArray);
        // another way
        System.out.println("First occurrence of " + chck + " is at index = " + Collections.min(intArray));
        System.out.println("Last occurrence of " + chck + " is at index = " + Collections.max(intArray));
        sc.close();
    }
}
