import java.util.Scanner;

public class timesTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Which numbers time table you want: ");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(+n + " x " + i + " = " + (n * i));
    }
    sc.close();
  }
}