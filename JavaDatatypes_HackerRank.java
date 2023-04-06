import java.math.BigInteger;
import java.util.*;

public class JavaDatatypes_HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextBigInteger();
            if (arr[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0
                    || arr[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(arr[i] + " can't be fitted anywhere.");
                continue;
            }
            System.out.println(arr[i] + " can be fitted in:");
            if ((arr[i]).compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0
                    && (arr[i]).compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0)
                System.out.println("* byte");
            if (arr[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0
                    && arr[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0)
                System.out.println("* short");
            if (arr[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
                    && arr[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0)
                System.out.println("* int");
            if (arr[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
                    && arr[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0)
                System.out.println("* long");
        }
        sc.close();
    }
}
