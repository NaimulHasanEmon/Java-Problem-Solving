class A {
    void display() {
        System.out.println("This is A class.");
    }
}

class B extends A {
    void display() { // overrides Inheritance.A.display
        super.display(); // super keyword gets the parent method
        System.out.println("This is B class.");
    }
}

public class SuperKeyword_2 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}