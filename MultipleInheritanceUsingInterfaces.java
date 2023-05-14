interface Animal {
    void walk();
}

interface Herbivore {
    void eat();
}

class Horse implements Animal, Herbivore {
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs.");
    }

    @Override
    public void eat() {
        System.out.println("Eat plants.");
    }
}

public class Main {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}
