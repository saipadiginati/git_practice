import com.sun.source.tree.SynchronizedTree;

public class Shared_Resource {

    boolean isValueAvailable= false;
    int i=0;

    public synchronized  void produce() {
        while (isValueAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            System.out.println("value produced is : " + ++i + " " + Thread.currentThread().getName());
            isValueAvailable = true;
            notifyAll();

    }

    public  synchronized void consume(){

        while(!isValueAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            System.out.println("value consumed is : " + i + Thread.currentThread().getName() );
            isValueAvailable= false;
            notifyAll();

    }

    public synchronized void charactersPrinting(String name){

        for( int i=0;i<name.length();i++){{
            System.out.print(name.charAt(i));
        }

        }

    }
}
