import java.util.concurrent.locks.ReentrantLock;

public class Reentrantshared {

    ReentrantLock l=new ReentrantLock();
    public void producer(){
        try{
            l.lock();
            System.out.println("Taking lock " + Thread.currentThread().getName());
            Thread.sleep(5000);
        }
        catch(Exception e){

        }
        finally {
            l.unlock();
            System.out.println("releasing the lock" + Thread.currentThread().getName());
        }

    }
}
