package ApnaCollege;

abstract class Animal {
    abstract void Walk();
}

class Horse {
    public void Walk() {
        System.out.println("Walks on 4 legs.");
    }
}

class Chicken {
    public void Walk() {
        System.out.println("Walks on 2 legs.");
    }
}

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.Walk();
        Chicken chicken = new Chicken();
        chicken.Walk();
    }
}
