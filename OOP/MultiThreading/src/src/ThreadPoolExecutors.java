import java.util.concurrent.*;

public class ThreadPoolExecutors {

    public static void main(String[] args) {

        ThreadPoolExecutor factory = new ThreadPoolExecutor(2, 4,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory() , new CustomRejectionHandled() );

        for(int i=0; i<9;i++) {

            factory.submit( () ->
                    {
                        try{
                            Thread.sleep(3000);
                            System.out.println("Thread name" + Thread.currentThread().getName());
                        }
                        catch(Exception e){}
                    }

                    );
        }
        factory.shutdown();
    }
}


class CustomRejectionHandled implements  RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("task denied" + r.toString() + executor.getRejectedExecutionHandler());

    }


}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}




