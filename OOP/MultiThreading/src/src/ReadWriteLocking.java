import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class ReadWriteLocking {

    //ReadWriteLock lock = new ReentrantReadWriteLock() ;
    StampedLock lock= new StampedLock();

    static  int a=10;

    public void produce() {

        //long stamp=lock.readLock();
        long stamp=lock.tryOptimisticRead();
        try
        {
         //lock.readLock().lock();

            System.out.println("Acquiring lock on" + Thread.currentThread().getName());
            a=11;
            if(lock.validate(stamp)){

                System.out.println(a);
                System.out.println("updated successfully");

            }
            else{
                System.out.println(a + "Roll back. lock is present. so not able to updated");

            }



        }
        catch (Exception e){
            System.out.println(e);
        }
//        finally {
//            //lock.unlockRead(stamp);
//            System.out.println("releasing the lock" + Thread.currentThread().getName());
//        }


    }

    public void consume()
    {
        long stamp= lock.writeLock();
        try{

           // lock.writeLock().lock();
            Thread.sleep(8000);

            System.out.println("Acquiring lock on" + Thread.currentThread().getName());


            a=9;
            System.out.println(a);

        }
        catch (Exception e) {
        }
            finally{
               lock.unlockWrite(stamp);
                System.out.println("releasing the lock" + Thread.currentThread().getName());
            }
        }


    }



