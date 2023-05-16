import java.util.Scanner;

interface Cliant {
    void input();

    void output();
}

class Dev implements Cliant {
    Scanner sc = new Scanner(System.in);
    int a = 0, b = 0;

    @Override
    public void input() {
        System.out.print("Enter first num: ");
        a = sc.nextInt();
        System.out.print("Enter second num: ");
        b = sc.nextInt();
    }

    @Override
    public void output() {
        System.out.println("Sum = " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Dev d = new Dev();
        d.input();
        d.output();
    }
}