import java.util.Scanner;

public class timesTable2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    for (int i = num1; i <= num2; i++) {
        for (int j = 1; j <= 10; j++) {
            System.out.println(+i + " x " + j + " = " + (i * j));
          }
          System.out.print("\n");
        }
        sc.close();
      }
    }