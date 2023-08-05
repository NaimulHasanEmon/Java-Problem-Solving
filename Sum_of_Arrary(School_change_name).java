class Solution {
    int sumElement(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {3, 2, 1};
        int n1 = 3;
        int result1 = solution.sumElement(arr1, n1);
        System.out.println(result1); // Output: 6

        int[] arr2 = {1, 2, 3, 4};
        int n2 = 4;
        int result2 = solution.sumElement(arr2, n2);
        System.out.println(result2); // Output: 10
    }
}
