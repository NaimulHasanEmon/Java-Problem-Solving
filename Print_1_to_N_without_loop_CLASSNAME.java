class Solution {
    void printNos(int N) {
        if (N > 1) {
            printNos(N - 1);
        }
        System.out.print(N + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int N1 = 10;
        solution.printNos(N1); // Output: 1 2 3 4 5 6 7 8 9 10

        int N2 = 5;
        solution.printNos(N2); // Output: 1 2 3 4 5
    }
}
