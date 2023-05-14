class Shape {
    int base, height;
}

class Triangle extends Shape {
    public void printArea() {
        System.out.println("The area of triangle is: " + (0.5 * base * height));
    }
}

class EquilateralTriangle extends Triangle {
    // EquilateralTriangle class takes all properties of Triangle class
    public void printTheArea() {
        System.out.println(
                "The area of equilateral  triangle is: " + String.format("%.2f", (Math.sqrt(3)) / 4 * base * base));
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        EquilateralTriangle eqt = new EquilateralTriangle();
        eqt.base = 10;
        eqt.height = 5;
        eqt.printArea();
        eqt.printTheArea();
    }
}
