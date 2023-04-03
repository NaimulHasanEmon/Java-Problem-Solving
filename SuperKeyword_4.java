class A {
    A() {
        System.out.println("const A.");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("const B.");
    }
}

public class SuperKeyword_4 {
    public static void main(String[] args) {
        new B();
        // we can use "B b = new B()" insted of "new B()" and the output will be the
        // same
    }
}