class Person {
    String Gender; // normal variable
    final String name = "Emon"; // final variable
    final int age; // Blank final variable
    static final int id; // static blank final variable

    // static blank final variable must be accessed by calling with static block
    static {
        id = 5601;
    }

    // blank final variable must be accessed by calling with constructor
    Person() {
        age = 22;
    }

    void display() {
        Gender = "Male"; // normal variable can be accessed easily by this
        System.out.println(Gender);
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }
}

public class Final_Keyword {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
