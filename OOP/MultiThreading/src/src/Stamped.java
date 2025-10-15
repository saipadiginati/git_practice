import java.util.concurrent.locks.StampedLock;

public class Stamped {
    int balance =0;
    StampedLock lock= new StampedLock();
    public void deposit(int amount){
        long stamp = lock.writeLock();
        System.out.println("write lock acqired");
        try {
            balance += amount;
            System.out.println("amount got deposited ");
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("write lock is released");
        }
    }

    public void balance(){

//        long stamp= lock.readLock();
        long stamp= lock.tryOptimisticRead();
        if(! lock.validate(stamp)) {

            stamp = lock.readLock();
            try {
                System.out.println("read lock acquired" + balance);
            } finally {
                lock.unlockRead(stamp);

                System.out.println("read lock released");
            }
        }
    }
}
