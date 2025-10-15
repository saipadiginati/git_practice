public class MultiThreadingBasics extends Thread {

    public void run(){
        int i=1;
        while(i<5){
            System.out.println("odd number: " + i +  " current thread" + Thread.currentThread().getName());
            i=i+2;
        }
    }


    public static void main(String[] args) {



        ImplementingRunnable r1= new ImplementingRunnable();
        Thread t1= new Thread(r1);
        t1.start();

        Thread t2= new MultiThreadingBasics();
        t2.start();
        int i =0;
        while(i<5){
            System.out.println("even number: " + i  +  " current thread" + Thread.currentThread().getName());
            i+=2;
        }


    }
}
