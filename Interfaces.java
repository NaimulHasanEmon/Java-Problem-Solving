package ApnaCollege;

interface Animal {
    void Walk();
}

interface Herbivore {

    void eat();
}

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