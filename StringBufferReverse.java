import java.util.*;

public class StringBufferReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);
        sc.close();
    }
} 