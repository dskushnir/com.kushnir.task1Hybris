package threading.lesson1_2;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello there...");
        System.out.println("Starting Thread-A (extends Thread)");
        Task taskRunner1 = new Task("Thread-A");
        taskRunner1.start();

        System.out.println("Starting Thread-B (extends Thread)");
        Task taskRunner2 = new Task("Thread-B");
        taskRunner2.start();

        System.out.println("Starting Thread-C (implements Runnable, shot code)");
        Thread t1 = new Thread(new Task("Thread-C"));
        t1.start();

        System.out.println("Starting Thread-4 (implements Runnable(Anonymous class) )");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("number" + i + "-" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        t2.start();
    }
}

class Task extends Thread {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        for (int i = 0; i < 100; i++) {
            System.out.println("number" + i + "-" + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Task1 implements Runnable {
    String name;

    public Task1(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        for (int i = 0; i < 100; i++) {
            System.out.println("number" + i + "-" + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

