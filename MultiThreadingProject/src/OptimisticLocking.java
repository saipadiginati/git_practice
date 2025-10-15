import java.util.concurrent.locks.StampedLock;

public class OptimisticLocking {

    int balance =0;
    int count=0;
    StampedLock lock=new StampedLock();

    public void deposit(int amount){

       long stamp= lock.writeLock();

       try {
           Thread.sleep(900);
           balance += amount;
           System.out.println("amount has been added" + amount);

       }
       catch (Exception e){}
       finally {
           lock.unlockWrite(stamp);
       }
    }

    public void checkBalance(){

            long stamp = lock.tryOptimisticRead();
        try {
            Thread.sleep(50);
        }catch (Exception e){};

        if(lock.validate(stamp)){
            System.out.println("balance is " +balance + Thread.currentThread().getName());
        }
        else{
           stamp= lock.readLock();
           try{
               System.out.println("balance is " + balance);
               count++;
           }
           finally {
               lock.unlockRead(stamp);
           }
        }


    }

    public boolean isbalance(){
        return balance <= 55 ;
    }

    public static void main(String[] args) {

        OptimisticLocking obj= new OptimisticLocking();

        Runnable write= new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (obj.isbalance() ) {
                    obj.deposit(i++);
                }
            }
        };

        Runnable read= new Runnable() {
            @Override
            public void run() {
                while(obj.isbalance()){
                    obj.checkBalance();
                }
            }
        };

        Thread write1= new Thread(write,"writer");
        Thread read1= new Thread(read,"reader1");
        Thread read2= new Thread(read,"reader2");

        write1.start();
        read1.start();
        read2.start();
    }
}
