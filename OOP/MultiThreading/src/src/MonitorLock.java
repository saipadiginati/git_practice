class Thread1 implements Runnable{
    SharedResource sharedresource;
    public void run(){
        sharedresource.task1();
    }

    public Thread1(SharedResource sharedresource){
        this.sharedresource=sharedresource;
    }
}

public class MonitorLock {

    public static void main(String[] args) {

        SharedResource obj=new SharedResource();
        Thread1 firstThread= new Thread1(obj);
        Thread t1= new Thread(firstThread);
        Thread t2= new Thread( () -> obj.task2());
        Thread t3 = new Thread(obj::task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
