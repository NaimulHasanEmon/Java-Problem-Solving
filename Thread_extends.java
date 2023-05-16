class Emon extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Emnon");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Emon e = new Emon();
        e.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Chaity");
        }
    }
}
