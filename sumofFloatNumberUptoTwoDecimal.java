import java.util.Scanner;

public class sumofFloatNumberUptoTwoDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two float numbers: ");
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    float sum = num1 + num2;
    System.out.printf("%.2f\n", sum);
    sc.close();
  }
}