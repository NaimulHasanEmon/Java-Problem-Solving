class A {
    A() {
        System.out.println("const A.");
    }
}

class B extends A {
    B() {
        System.out.println("const B.");
    }
}

public class SuperKeyword_3 {
    public static void main(String[] args) {
        B b = new B();
        // we can use "new B()" insted of "B b = new B()" and the output will be the
        // same
    }
}
