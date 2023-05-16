// Base class or Parent class
class Shape {
    String color;
}

// Sub class or Child class
class Triangle extends Shape {
    // Triangle class takes all properties of Shape class
    public void printColor() {
        System.out.println(color);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(); // Intantiating a new Triangle object.
        t1.color = "Black";
        t1.printColor();
    }
}
