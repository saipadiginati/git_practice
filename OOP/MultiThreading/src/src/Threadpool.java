import java.util.concurrent.*;

public class Threadpool {
    public static void main(String[] args) {


    ThreadPoolExecutor factory= new ThreadPoolExecutor(2, 4, 10,
            TimeUnit.MINUTES, new ArrayBlockingQueue<>(5));

    for(int i=1; i<11;i++){

        final int taskId=i;
        factory.execute( () -> {System.out.println("Task " + taskId +
                " is running on " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskId + " completed.");});
    }

    factory.shutdown();

}
}
