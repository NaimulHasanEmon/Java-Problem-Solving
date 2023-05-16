class A implements Runnable {
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
        A a = new A();
        Thread t = new Thread(a);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Chaity");
            Thread.sleep(1000);
        }
    }
}