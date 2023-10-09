package thread;


public class OddEven {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Even even = new Even(printer);
        Odd odd = new Odd(printer);
        odd.start();
        even.start();
    }
}

class Printer {
    static int counter = 1;
    Object lock = new Object();
    static boolean flag = true;
    static final int MAX_COUNT = 10;

    public void print() {
        synchronized (lock) {
            while (counter <= MAX_COUNT) {
                try {
//                    while ((!flag && counter % 2 == 0) || (flag && counter % 2 == 1)) {
//                        flag = !flag;
//                        lock.wait();
//                    }
                    while (!flag) {
                        flag = !flag;
                        lock.wait();
                    }

                    System.out.println(Thread.currentThread().getName()
                            + " => " + counter);
                    counter++;

                    flag = !flag;
                    lock.notifyAll();


                } catch (InterruptedException e) {
                    System.err.println("Thread interrupted: " + e.getMessage());
                    return;
                }
            }
        }
    }
}

class Odd extends Thread {
    Printer printer;

    Odd(Printer p) {
        super("Odd Thread");
        printer = p;
    }

    @Override
    public void run() {
        while (Printer.counter <= Printer.MAX_COUNT) {
            printer.print();
        }
    }
}

class Even extends Thread {
    Printer printer;

    Even(Printer p) {
        super("Even Thread");
        printer = p;
    }

    @Override
    public void run() {
        while (Printer.counter <= Printer.MAX_COUNT) {
            printer.print();
        }
    }
}
