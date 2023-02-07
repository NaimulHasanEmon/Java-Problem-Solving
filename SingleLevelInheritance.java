// Base class or Parent class
class Shape {
    int base, height;

    public void printArea() {
        System.out.print("The area is: ");
    }
}

// Sub class or Child class
class Triangle extends Shape {
    // Triangle class takes all properties of Shape class
    public void printColor() {
        System.out.println(0.5 * base * height);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.base = 10;
        t1.height = 5;
        t1.printArea();
        t1.printColor();
    }
}
