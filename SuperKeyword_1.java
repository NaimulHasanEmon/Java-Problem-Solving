class A {
    int x = 10;
}

class B extends A {
    int x = 5;

    void display() {
        System.out.println(super.x); // super keyword goes to the parent class
        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
