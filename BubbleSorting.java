public class BubbleSorting {
    public static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 5, 1, 0, 4 };
        int temp;
        // bubble sort.
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        printArray(num);
    }
}