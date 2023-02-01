class Shape {
    int base, height, radius;
}

class Triangle extends Shape {
    // Triangle class takes all properties of Shape class
    void printArea() {
        System.out.print("The area of triangle is: " + (0.5 * base * height));
    }
}

class Circle extends Shape {
    // Circle class takes all properties of Shape class
    void printTheArea() {
        System.out.println("\nThe area of circle is: " + Math.PI * radius * radius);
    }
}

public class HierarchialLevelInheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        t1.base = 10;
        t1.height = 5;
        c1.radius = 15;
        t1.printArea();
        c1.printTheArea();
    }
}