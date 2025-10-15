import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity {

    AtomicInteger counter= new AtomicInteger(0);


    public  void increment(){
        counter.incrementAndGet();
    }
    public AtomicInteger get(){
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {

        Atomicity a= new Atomicity();
//        for(int i=0;i<400;i++){
//            a.increment();
//
//        }
//
//        System.out.println(a.counter);
        Thread t1= new Thread( () ->
        {
            for(int i=0;i<50000;i++) {
                a.increment();
            }
        }

                );

        Thread t2= new Thread( () ->
        {
            for(int i=0;i<50000;i++) {
                a.increment();
            }
        }

        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(a.get());




    }

}
