public class maximumNumber2 {
    public static void main(String[] args) {
      int a = 4, b = 5, c = 7, d = 9;
      System.out.println("The maximum number is: " + Math.max(a, (Math.max(b, Math.max(c, d)))));
    }
  }