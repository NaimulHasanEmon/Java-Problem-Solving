class Emon extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Emon");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Emon e = new Emon();
        e.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Chaity");
            Thread.sleep(1000);
        }
    }
}
