class Shape {
    String color;
    int sides;
}

class Circle extends Shape {
    public void printInfo() {
        System.out.println("Circle: " + this.color + ", " + this.sides);
    }
}

class Triangle extends Shape {
    public void printInfo() {
        System.out.println("Triangle: " + this.color + ", " + this.sides);
    }
}

class equilateralTriangle extends Triangle {
    public void printInfo() {
        System.out.println("Eqilateral triangle: " + this.color + ", " + this.sides);
    }
}

public class HybridInheritence {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.color = "Yello";
        c.sides = 0;
        c.printInfo();
        Triangle t = new Triangle();
        t.color = "Red";
        t.sides = 3;
        t.printInfo();
        equilateralTriangle et = new equilateralTriangle();
        et.color = "Purple";
        et.sides = 3;
        et.printInfo();
    }
}
