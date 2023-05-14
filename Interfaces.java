interface Animal {
    void walk();

    void eat();
}

class Horse implements Animal {
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs.");
    }

    @Override
    public void eat() {
        System.out.println("They eats.");
    }
}

public class Main {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}
