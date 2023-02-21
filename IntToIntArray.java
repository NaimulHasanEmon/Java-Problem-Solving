import java.util.*;

public class IntToIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int[] numArr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            numArr[i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println(Arrays.toString(numArr));
        sc.close();
    }
}