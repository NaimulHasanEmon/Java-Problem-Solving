class Solution {
    void print(int arr[], int n) {
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {1, 2, 3, 4};
        int n1 = 4;
        solution.print(arr1, n1); // Output: 1 3

        int[] arr2 = {1, 2, 3, 4, 5};
        int n2 = 5;
        solution.print(arr2, n2); // Output: 1 3 5
    }
}
