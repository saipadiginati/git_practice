class SharedObjForDeadLock{

    synchronized public void name(){

        //String name="sai";
        System.out.println("lock acquired" + Thread.currentThread().getName());
        try{
            Thread.sleep(100);
        }
        catch(Exception e){

        }
        System.out.println("lock released" + Thread.currentThread().getName());
        notifyAll();



    }
}

public class DeadLock {
    public static void main(String[] args) {

        System.out.println("Main thread is started");
        SharedObjForDeadLock obj = new SharedObjForDeadLock();

        Thread t1 = new Thread(() ->
        {
            obj.name();

        }

        );

        Thread t2 = new Thread(() ->
        {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("thread 2 is calling the shared object");
            obj.name();
        }
        );

        t1.start();

        t2.start();

        //t1.stop();

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("main thread completed");

    }

}
