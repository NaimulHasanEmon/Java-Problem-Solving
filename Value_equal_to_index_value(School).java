import java.util.ArrayList;

class Solution {
    ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr1 = {15, 2, 45, 12, 7};
        int n1 = 5;
        ArrayList<Integer> result1 = solution.valueEqualToIndex(arr1, n1);
        System.out.println(result1); // Output: [2]

        int[] arr2 = {1};
        int n2 = 1;
        ArrayList<Integer> result2 = solution.valueEqualToIndex(arr2, n2);
        System.out.println(result2); // Output: [1]
    }
}
