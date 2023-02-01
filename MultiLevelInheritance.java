class Shape {
    int base, height;
}

class Triangle extends Shape {
    public void printArea() {
        System.out.print("The area is: ");
    }
}

class EquilateralTriangle extends Triangle {
    // Triangle class takes all properties of Shape class
    public void printTheArea() {
        System.out.println(0.5 * base * height);
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