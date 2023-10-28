// Static is for something that is common for all

class Student {
    String name;
    static String school; // Here the school name is same for all
}

public class Main {
    public static void main(String[] args) {
        Student.school = "BCBHC"; // Input using class name
        Student stu = new Student();
        stu.name = "Emon"; // Input using object name
        System.out.println(stu.name);
        System.out.println(Student.school);
    }
}
