public class Q14 {
}
class Storage {
    int value;
}

class Counter extends Thread {
    Storage s;

    Counter(Storage s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            s.value = i;
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Printer extends Thread {
    Storage s;

    Printer(Storage s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(s.value);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {

        Storage s = new Storage();

        Counter c = new Counter(s);
        Printer p = new Printer(s);

        c.start();
        p.start();
    }
}
