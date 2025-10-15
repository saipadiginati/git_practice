public class ImplementingRunnable implements Runnable{


    @Override
    public void run() {

        int i=1;
        while(i<5){
            System.out.println("hello" + i++ + " current thread" + Thread.currentThread().getName());
        }
    }


}
