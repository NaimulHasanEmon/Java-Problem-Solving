import java.util.*;

public class StringBufferPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb);
        sc.close();
    }
}