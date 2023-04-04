class Person {
    final String name = "Emon";
    int age = 10;

    void display() {
        // we can not use "name = "Naimul"" because it was declired as final type.
        age = 22;
        System.out.println(name);
        System.out.println(age);
    }
}

public class Final_Keyword {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}