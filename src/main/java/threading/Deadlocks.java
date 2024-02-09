package threading;
public class Deadlocks {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    public String method1() {
        StringBuilder result = new StringBuilder();

        synchronized (lock1) {
            result.append(Thread.currentThread().getName()).append(" acquired lock1\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result.append(Thread.currentThread().getName()).append(" waiting for lock2\n");

            synchronized (lock2) {
                result.append(Thread.currentThread().getName()).append(" acquired lock2\n");
            }
        }

        return result.toString();
    }

    public String method2() {
        StringBuilder result = new StringBuilder();

        synchronized (lock2) {
            result.append(Thread.currentThread().getName()).append(" acquired lock2\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result.append(Thread.currentThread().getName()).append(" waiting for lock1\n");

            synchronized (lock1) {
                result.append(Thread.currentThread().getName()).append(" acquired lock1\n");
            }
        }
        return result.toString();
    }
}

