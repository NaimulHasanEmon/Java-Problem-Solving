import java.util.Scanner;

public class maximumNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The maximum number is: " + Math.max(a, b));
    sc.close();
  }
}