package ApnaCollege;

interface Animal {
    void Walk();
    void eat();
}

class Horse implements Animal {
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