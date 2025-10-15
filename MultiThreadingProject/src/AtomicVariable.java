import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {

    AtomicInteger count= new AtomicInteger(1);
//    int count=1;

    public void increment(){
        count.incrementAndGet();
      //  count++;
    }
    public int getValue(){
        System.out.println(count.get());
        return count.get();
//        System.out.println(count);
//        return count;
    }

    public static void main(String[] args) {

        AtomicVariable obj= new AtomicVariable();
        Thread t1= new Thread( () ->
        {
            for(int i=1;i<=100000;i++) {
                obj.increment();
                obj.getValue();
            }
        });

        Thread t2= new Thread( () ->
        {
            for(int i=1;i<=100000;i++) {
                obj.increment();
                obj.getValue();
            }
        });

        t1.start();
        t2.start();

    }

}