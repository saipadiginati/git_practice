import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {



    public static void main(String[] args) {

        System.out.println("Main thread is started");
        Reentrantshared obj=new Reentrantshared();
       // Reentrantshared obj1=new Reentrantshared();
        Thread t1= new Thread(() ->
        {

            obj.producer();


        });
        Thread t2=new Thread(() ->
        {
           obj.producer();

        });

        t1.start();
        t2.start();
        System.out.println("main thread completed");

    }
}
