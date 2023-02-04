public class StringToPrimitive {
    public static void main(String[] args) {
        String ch = "50";
        int a = Integer.parseInt(ch);
        float b = Float.parseFloat(ch);
        double c = Double.parseDouble(ch);
        boolean d = Boolean.parseBoolean(ch);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}