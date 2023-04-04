class Vehicle {
    String color;
    int price;

    Vehicle(String c, int p) {
        color = c;
        price = p;
    }

    void attribute() {
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

class Car extends Vehicle {
    int gear;

    Car(String c, int p, int g) {
        super(c, p);
        gear = g;
    }

    void attribute() {
        super.attribute();
        System.out.println("Gear: " + gear);
    }
}

public class Super_keyword {

    public static void main(String[] args) {
        Car tesla = new Car("Red", 1000, 50);
        tesla.attribute();
    }
}