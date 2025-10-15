import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class FactorialBatchMulti {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int BATCH_SIZE = 5;
    private int i = 1; // number to produce
    private final int MAX = 25;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();  // for producers
    private final Condition notEmpty = lock.newCondition(); // for consumers

    // Produce batch
    public void produceBatch() throws InterruptedException {
        lock.lock();
        try {
            while (!queue.isEmpty()) { // wait if previous batch not consumed
                notFull.await();
            }

            int count = 0;
            while (count < BATCH_SIZE && i <= MAX) {
                queue.add(i++);
                count++;
            }
            System.out.println(Thread.currentThread().getName() + " produced batch: " + queue);
            notEmpty.signalAll(); // notify all consumers
        } finally {
            lock.unlock();
        }
    }

    // Consume batch
    public void consumeBatch() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) { // wait if no batch produced
                notEmpty.await();
            }

            System.out.print(Thread.currentThread().getName() + " consumed batch: ");
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
            notFull.signalAll(); // notify all producers
        } finally {
            lock.unlock();
        }
    }

    public boolean isDone() {
        return i > MAX && queue.isEmpty();
    }
}

public class abc {
    public static void main(String[] args) {
        FactorialBatchMulti fb = new FactorialBatchMulti();

        Runnable producerTask = () -> {
            try {
                while (!fb.isDone()) {
                    fb.produceBatch();
                    Thread.sleep(100); // simulate work
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumerTask = () -> {
            try {
                while (!fb.isDone()) {
                    fb.consumeBatch();
                    Thread.sleep(200); // simulate processing
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Multiple producers
        Thread p1 = new Thread(producerTask, "Producer-1");
        Thread p2 = new Thread(producerTask, "Producer-2");

        // Multiple consumers
        Thread c1 = new Thread(consumerTask, "Consumer-1");
        Thread c2 = new Thread(consumerTask, "Consumer-2");

        // Start all threads
        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
