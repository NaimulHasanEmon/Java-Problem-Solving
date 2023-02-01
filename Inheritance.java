class Shape {
    String color;
}

class Triangle extends Shape {
    // Triangle class takes all properties of Shape class
    public void printColor() {
        System.out.println(color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Black";
        t1.printColor();
    }
}