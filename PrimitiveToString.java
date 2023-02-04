public class PrimitiveToString {
    public static void main(String[] args) {
        int num = 10;
        float num2 = 10.45f;
        double num3 = 10.34524432;
        boolean val = true;
        String str = Integer.toString(num);
        String str2 = Float.toString(num2);
        String str3 = Double.toString(num3);
        String str4 = Boolean.toString(val);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}