package ApnaCollege;

// Parent 1
interface Animal {
    void Walk();
}

// Parent 2
interface Herbivore {

    void eat();
}

// Multiple parent for single chil
class Horse implements Animal, Herbivore {
    public void Walk() {
        System.out.println("Walks on 4 legs.");
    }

    public void eat() {
        System.out.println("They eat.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.Walk();
        horse.eat();
    }
}
